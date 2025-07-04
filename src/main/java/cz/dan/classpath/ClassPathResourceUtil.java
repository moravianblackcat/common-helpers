package cz.dan.classpath;

import java.io.IOException;
import java.util.List;

public class ClassPathResourceUtil {

    private final ObjectMapper objectMapper;

    public <T> List<T> getListFromJsonPath(String jsonPath, TypeReference<List<T>> typeRef) throws IOException {
        return objectMapper.readValue(new ClassPathResource(jsonPath).getFile(), typeRef);
    }
    
}
