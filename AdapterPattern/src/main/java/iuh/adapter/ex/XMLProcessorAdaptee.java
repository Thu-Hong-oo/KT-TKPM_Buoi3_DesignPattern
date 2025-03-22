package iuh.adapter.ex;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLProcessorAdaptee {
    private final XmlMapper xmlMapper;

    public XMLProcessorAdaptee() {
        this.xmlMapper = new XmlMapper();
    }

    public JsonNode convertXMLToJsonNode(String xml) throws Exception {
        return xmlMapper.readTree(xml.getBytes());
    }
}
