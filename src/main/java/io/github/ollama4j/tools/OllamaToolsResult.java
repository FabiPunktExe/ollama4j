package io.github.ollama4j.tools;

import io.github.ollama4j.models.response.OllamaResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OllamaToolsResult {
    private @Getter OllamaResult modelResult;
    private Map<ToolFunctionCallSpec, Object> toolResults;

    public List<ToolResult> getToolResults() {
        List<ToolResult> results = new ArrayList<>();
        for (Map.Entry<ToolFunctionCallSpec, Object> r : this.toolResults.entrySet()) {
            results.add(new ToolResult(r.getKey().getName(), r.getKey().getArguments(), r.getValue()));
        }
        return results;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ToolResult {
        private String functionName;
        private Map<String, Object> functionArguments;
        private Object result;
    }
}
