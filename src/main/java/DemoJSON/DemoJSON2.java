package DemoJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

//Ref : Codippa
@JsonIgnoreProperties(ignoreUnknown = true)
class Laptop{
     String brand;
     String model;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
public class DemoJSON2 {
    public static void main(String[] args) {
        //Laptop laptop1 = new Laptop("Dell", "Inspriron");
        Laptop laptop1;
        String jsonString1 = "{\"brand\": \"Dell\", \"model\": \"Inspiron\", \"serial\": \"12345\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            laptop1 = objectMapper.readValue(jsonString1, Laptop.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(laptop1);


    }
}
