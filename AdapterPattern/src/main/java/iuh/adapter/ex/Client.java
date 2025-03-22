package iuh.adapter.ex;

public class Client {
    public static void main(String[] args) {
        String xmlData = "<student><name>John Doe</name><age>22</age><email>john@example.com</email></student>";
        XMLtoJsonAdapterTarget adapter = new JacksonXMLToJsonAdapter(new XMLProcessorAdaptee()); // Adapter
        adapter.convertXMLToJson(xmlData);
    }
}
