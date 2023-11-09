package io.github.amithkoujalgi.ollama4j.core.models;

public class Model {
    private String name, modified_at, digest;
    private Long size;

    /**
     * Returns the model's tag. This includes model name and its version separated by a colon character `:`
     * @return model tag
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the model name without its version
     * @return model name
     */
    public String getModelName() {
        return name.split(":")[0];
    }

    /**
     * Returns the model version without its name
     * @return model version
     */
    public String getModelVersion() {
        return name.split(":")[1];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModified_at() {
        return modified_at;
    }

    public void setModified_at(String modified_at) {
        this.modified_at = modified_at;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

}
