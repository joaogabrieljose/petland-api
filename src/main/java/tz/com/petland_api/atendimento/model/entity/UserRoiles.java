package tz.com.petland_api.atendimento.model.entity;

public enum UserRoiles {
    ADMIN("admin"), 
    USER("user");

    private String role;

     UserRoiles(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
