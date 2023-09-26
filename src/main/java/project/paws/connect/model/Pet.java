package project.paws.connect.model;

public class Pet {
    private Long id;
    private String name;
    private String type;

    private Long userId;

    public Pet(String name, String type) {
        setName(name);
        setType(type);
    }

    public Pet() {

    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}