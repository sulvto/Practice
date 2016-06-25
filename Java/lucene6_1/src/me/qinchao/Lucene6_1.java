package me.qinchao;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.NIOFSDirectory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by sulvto on 16-6-25.
 */
public class Lucene6_1 {
    private String doc1 = "结构化数据：指具有固定格式或有限长度的数据，如数据库，元数据等;";
    private String doc2 = "非结构化数据：指不定长或无固定格式的数据，如邮件，word文档等;";
    private String doc3 = "半结构化数据，如XML，HTML等，当根据需要可按结构化数据来处理，也可抽取出纯文本按非结构化数据来处理。";
    private String searchKey = "结构";
    private String indexPath = Lucene6_1.class.getResource("/").getFile() + File.separator + "firstIndex";


    @Test
    public void createIndex() throws Exception {
        Directory directory = new NIOFSDirectory(Paths.get(indexPath));

        Analyzer analyzer = new IKAnalyzer();// 中文分词器
        IndexWriterConfig config = new IndexWriterConfig(analyzer);

        IndexWriter indexWriter = new IndexWriter(directory, config);
        Document document1 = new Document();
        document1.add(new TextField("title", "doc1", Field.Store.YES));
        document1.add(new TextField("content", doc1, Field.Store.YES));
        Document document2 = new Document();
        document2.add(new TextField("title", "doc2", Field.Store.YES));
        document2.add(new TextField("content", doc2, Field.Store.YES));
        Document document3 = new Document();
        document3.add(new TextField("title", "doc3", Field.Store.YES));
        document3.add(new TextField("content", doc3, Field.Store.YES));
        indexWriter.addDocument(document1);
        indexWriter.addDocument(document2);
        indexWriter.addDocument(document3);
        indexWriter.close();
    }

    @Test
    public void search() throws Exception {
        Directory directory = new NIOFSDirectory(Paths.get(indexPath));
        IndexReader indexReader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(indexReader);
        Analyzer analyzer = new IKAnalyzer();// 中文分词器
        Query query = new QueryParser("title", analyzer).parse(searchKey);

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
