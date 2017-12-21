package ConvertTestCaseTool;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "steps" )
@XmlAccessorType(XmlAccessType.FIELD)
public class StepsList {
	@XmlElement(name = "step")
	List<StepFormat> steps = null;
	
	public void setTestCases(List<StepFormat> steps){
		this.steps=steps;
	}
	public void add(StepFormat step){
		if(this.steps ==null){
			this.steps = new ArrayList<StepFormat>();
		}
		this.steps.add(step);
	}
}
