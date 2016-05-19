package me.qinchao.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;

public class HelloWorld {
    private String doc1 = "结构化数据：指具有固定格式或有限长度的数据，如数据库，元数据等;";
    private String doc2 = "非结构化数据：指不定长或无固定格式的数据，如邮件，word文档等;";
    private String doc3 = "半结构化数据，如XML，HTML等，当根据需要可按结构化数据来处理，也可抽取出纯文本按非结构化数据来处理。";
    private String searchKey = "结构";
    private String indexPath = HelloWorld.class.getResource("/").getFile() + File.separator + "firstIndex";


    @Test
    public void createIndex() throws Exception {
        Directory directory = FSDirectory.open(new File(indexPath));
        // Analyzer a = new StandardAnalyzer(Version.LUCENE_30);
        Analyzer a = new IKAnalyzer();// 中文分词器
        IndexWriter indexWriter = new IndexWriter(directory, a, new IndexWriter.MaxFieldLength(100));
        Document document1 = new Document();
        document1.add(new Field("title", "doc1", Field.Store.YES, Field.Index.ANALYZED));
        document1.add(new Field("content", doc1, Field.Store.YES, Field.Index.ANALYZED));
        Document document2 = new Document();
        document2.add(new Field("title", "doc2", Field.Store.YES, Field.Index.ANALYZED));
        document2.add(new Field("content", doc2, Field.Store.YES, Field.Index.ANALYZED));
        Document document3 = new Document();
        document3.add(new Field("title", "doc3", Field.Store.YES, Field.Index.ANALYZED));
        document3.add(new Field("content", doc3, Field.Store.YES, Field.Index.ANALYZED));
        indexWriter.addDocument(document1);
        indexWriter.addDocument(document2);
        indexWriter.addDocument(document3);
        indexWriter.close();
    }

    @Test
    public void search() throws Exception {
        Directory path = FSDirectory.open(new File(indexPath));
        IndexSearcher searcher = new IndexSearcher(path);
        // Analyzer a = new StandardAnalyzer(Version.LUCENE_30);
        Analyzer a = new IKAnalyzer();// 中文分词器
        QueryParser parser = new QueryParser(Version.LUCENE_30, "content", a);
        Query query = parser.parse(searchKey);
        TopDocs search = searcher.search(query, 10);
        System.out.println("lucene本次共搜索到" + search.totalHits + "个结果...");
        ScoreDoc[] scoreDocs = search.scoreDocs;
        for (ScoreDoc scoreDoc : scoreDocs) {
            int docId = scoreDoc.doc;
            Document doc = searcher.doc(docId);
            System.out.println("标题:" + doc.get("title"));
            System.out.println("内容:" + doc.get("content"));
            System.out.println("分数:" + scoreDoc.score);
            System.out.println();
        }
    }
}
