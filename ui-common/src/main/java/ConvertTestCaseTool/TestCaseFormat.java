package ConvertTestCaseTool;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.sun.xml.txw2.annotation.XmlCDATA;

@XmlRootElement(name = "testcase")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCaseFormat {
	@XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String node_order;
    @XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String externalid;
    @XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String version;
    @XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String summary;
    @XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String preconditions;
    @XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String execution_type;
    @XmlElement
    @XmlJavaTypeAdapter(AdaptorCDATA.class)
    private String importance;
    
    @XmlAttribute(name = "internalid")
    private String inter;
    
    @XmlAttribute(name = "name")
    private String nameAttr;
    
    @XmlElement(name = "steps")
    private ArrayList<StepsList> steps;
    
    public void add(StepsList step){
		if(this.steps ==null){
			this.steps = new ArrayList<StepsList>();
		}
		this.steps.add(step);
	}
	
    @XmlCDATA
    public void setNodeOrder(String node_order) {
        this.node_order = node_order;
    }
    @XmlCDATA
    public void setExternalid(String externalid) {
        this.externalid = externalid;
    }
    @XmlCDATA
    public void setVersion(String version) {
        this.version = version;
    }
    @XmlCDATA
    public void setSummary(String summary) {
        this.summary = summary;
    }
    @XmlCDATA
    public void setPreconditions(String preconditions) {
        this.preconditions = preconditions;
    }
    @XmlCDATA
    public void setExecutionType(String execution_type) {
    	String executionNumb = "";
    	if(execution_type.equals("Automated")){
    		executionNumb = "2";
    	}else executionNumb = "1";
        this.execution_type = executionNumb;
    }
    @XmlCDATA
    public void setImportance(String importance) {
    	String importNumb = "";
    	if(importance.equals("High")){
    		importNumb = "3";
    	}else if (importance.equals("Medium")){
    		importNumb = "2";
    	}else {
    		importNumb = "1";
    	}
        this.importance = importNumb;
    }
    
    public void setAttributeInter(String inter){
    	this.inter = inter;
    }
    
    public void setAttributeName(String name){
    	this.nameAttr = name;
    }

  
}
