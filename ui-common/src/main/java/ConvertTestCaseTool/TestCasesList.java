package ConvertTestCaseTool;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "testcases" )
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCasesList {
	@XmlElement(name = "testcase")
	List<TestCaseFormat> testcases = null;
	
	public void setTestCases(List<TestCaseFormat> testcases){
		this.testcases=testcases;
	}
	public void add(TestCaseFormat testcase){
		if(this.testcases ==null){
			this.testcases = new ArrayList<TestCaseFormat>();
		}
		this.testcases.add(testcase);
	}
}
