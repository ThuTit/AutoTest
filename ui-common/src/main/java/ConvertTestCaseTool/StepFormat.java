package ConvertTestCaseTool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.sun.xml.txw2.annotation.XmlCDATA;

@XmlRootElement(name = "step")
@XmlAccessorType(XmlAccessType.FIELD)
public class StepFormat {
	@XmlElement
    @XmlJavaTypeAdapter(value = AdaptorCDATA.class)
    private String step_number;
	
	@XmlElement
    @XmlJavaTypeAdapter(value = AdaptorCDATA.class)
    private String actions;
	
	@XmlElement
    @XmlJavaTypeAdapter(value = AdaptorCDATA.class)
    private String expectedresults;
	
	@XmlElement
    @XmlJavaTypeAdapter(value = AdaptorCDATA.class)
    private String execution_type;
	
	@XmlCDATA
    public void setStepNumber(String step_number) {
        this.step_number = step_number;
    }
	
	@XmlCDATA
    public void setActions(String actions) {
        this.actions = actions;
    }
	@XmlCDATA
    public void setExpectedResults(String expectedresults) {
        this.expectedresults = expectedresults;
    }
	@XmlCDATA
    public void setExecution_type(String execution_type) {
		String executionNumb="";
    	if(execution_type.equals("Automated")){
    		executionNumb="2";
    	}else executionNumb="1";
        this.execution_type = executionNumb;
    }
}
