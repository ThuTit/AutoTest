package ConvertTestCaseTool;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdaptorCDATA extends XmlAdapter<String, String> {
	private static final String CDATA_END = "]]>";
	private static final String CDATA_BEGIN = "<![CDATA[";

	@Override
	public String marshal(String arg0) throws Exception {
		return CDATA_BEGIN + arg0 + CDATA_END;
	}

	@Override
	public String unmarshal(String arg0) throws Exception {
		if (arg0.startsWith(CDATA_BEGIN) && arg0.endsWith(CDATA_END)) {

			arg0 = arg0.substring(CDATA_BEGIN.length(), arg0.length()
					- CDATA_END.length());
		}
		return arg0;
	}
}
