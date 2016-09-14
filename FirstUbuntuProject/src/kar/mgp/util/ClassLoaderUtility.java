package kar.mgp.util;

import java.util.HashMap;
import java.util.Map;

import kar.mgp.model.Mapping;
import kar.mgp.model.XMLSection;

public class ClassLoaderUtility {

	static XMLSection section = new XMLSection();

	static Map<String, String> mappingData = new HashMap<String, String>();

	static Mapping mapping = null;
	static {
		mapping = new Mapping();
		Map<String, Map<String, String>> configMap = new HashMap<String, Map<String, String>>();
		mappingData.put(mapping.getEndeca(), mapping.getApi());
		configMap.put(section.getHeadSection(), mappingData);
	}

	public static void loadStaticMembers() {
		ClassLoaderUtility.mappingData.get(mapping.getEndeca());
	}
}
