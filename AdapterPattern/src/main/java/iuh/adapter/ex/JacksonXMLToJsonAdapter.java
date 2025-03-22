package iuh.adapter.ex;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonXMLToJsonAdapter implements XMLtoJsonAdapterTarget {

    private final XMLProcessorAdaptee xmlProcessorAdaptee; // Adaptee thực sự
    private final ObjectMapper objectMapper;

    public JacksonXMLToJsonAdapter(XMLProcessorAdaptee xmlProcessorAdaptee) {
        this.xmlProcessorAdaptee = xmlProcessorAdaptee;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public void convertXMLToJson(String xml) {
        try {
            // Sử dụng Adaptee để chuyển XML thành JsonNode
            JsonNode jsonNode = xmlProcessorAdaptee.convertXMLToJsonNode(xml);

            // Chuyển JsonNode thành chuỗi JSON
            System.out.println("JSON Output:");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
