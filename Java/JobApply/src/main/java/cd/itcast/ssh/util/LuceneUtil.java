package cd.itcast.ssh.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Formatter;
import org.apache.lucene.search.highlight.Fragmenter;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.Scorer;
import org.apache.lucene.search.highlight.SimpleFragmenter;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import cd.itcast.ssh.domain.Job;

public class LuceneUtil {

	private static String indexPath = "E:\\MyCodeWork\\JobApply\\firstIndex";

	public static void createIndex(Document document) throws Exception {
		Directory d = FSDirectory.open(new File(indexPath));
		Analyzer a = new IKAnalyzer();// 中文分词器
		IndexWriter indexWriter = new IndexWriter(d, a, new MaxFieldLength(100));
		indexWriter.addDocument(document);
		indexWriter.close();
		System.out.println("索引创建成功!!!");
	}

	@Test
	public void testSearch() throws Exception {
		search("北京", "City",null);
	}

	public static List<Job> search(String str, String fieldName,List<String> ids)
			throws Exception {
		System.out.println(str + "===" + fieldName);
		List<Job> jobs = new ArrayList<>();
		if (StringUtils.isNotEmpty(str)) {
			Directory path = FSDirectory.open(new File(indexPath));
			IndexSearcher searcher = new IndexSearcher(path);
			Analyzer analyzer = new IKAnalyzer();// 中文分词器
			QueryParser parser = new QueryParser(Version.LUCENE_30, fieldName,
					analyzer);
			Query query = parser.parse(str);
			TopDocs search = searcher.search(query, 10);
			System.out.println("lucene本次共搜索到" + search.totalHits + "个结果...");
			ScoreDoc[] scoreDocs = search.scoreDocs;
			for (ScoreDoc scoreDoc : scoreDocs) {
				int docId = scoreDoc.doc;
				Document doc = searcher.doc(docId);
				String id = doc.get("Id");
				if (!ids.contains(id)) {
					ids.add(id);
					Scorer fragmentScorer = new QueryScorer(query);
					Formatter formatter = new SimpleHTMLFormatter(
							"<font color='red'>", "</font>");
					Highlighter highlighter = new Highlighter(formatter,
							fragmentScorer);
					Fragmenter fragmenter = new SimpleFragmenter(30);
					highlighter.setTextFragmenter(fragmenter);

					Job job = new Job();
					setjob(highlighter, analyzer, doc, job);
					jobs.add(job);
				}
				System.out.println("分数:" + scoreDoc.score);
			}
			System.out.println("ids "+ids);
		}
		return jobs;
	}

	public static void setjob(Highlighter highlighter, Analyzer analyzer,
			Document doc, Job job) {
		try {
			String City = highlighter.getBestFragment(analyzer, "City",
					doc.get("City"));
			String Title = highlighter.getBestFragment(analyzer, "Title",
					doc.get("Title"));
			String Content = highlighter.getBestFragment(analyzer, "Content",
					doc.get("Content"));
			String Company = highlighter.getBestFragment(analyzer, "Company",
					doc.get("Company"));
			String SalaryLevel = highlighter.getBestFragment(analyzer,
					"SalaryLevel", doc.get("SalaryLevel"));
			String Trade = highlighter.getBestFragment(analyzer, "Trade",
					doc.get("Trade"));
			String CompanyType = highlighter.getBestFragment(analyzer,
					"CompanyType", doc.get("CompanyType"));
			if (City == null) {
				job.setCity(doc.get("City"));
			} else {
				job.setCity(City);
			}
			if (Title == null) {
				job.setTitle(doc.get("Title"));
			} else {
				job.setTitle(Title);
			}
			if (Content == null) {
				Content = doc.get("Content").substring(0, 30) + "...";
				job.setContent(Content);
			} else {
				job.setContent(Content);
			}
			if (Company == null) {
				job.setCompany(doc.get("Company"));
			} else {
				job.setCompany(Company);
			}
			if (SalaryLevel == null) {
				job.setSalaryLevel(doc.get("SalaryLevel"));
			} else {
				job.setSalaryLevel(SalaryLevel);
			}
			if (Trade == null) {
				job.setTrade(doc.get("Trade"));
			} else {
				job.setTrade(Trade);
			}
			if (CompanyType == null) {
				job.setTrade(doc.get("CompanyType"));
			} else {
				job.setTrade(CompanyType);
			}
		} catch (IOException | InvalidTokenOffsetsException e) {
			e.printStackTrace();
		}
	}
}
