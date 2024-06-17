package registerationlogin.shared;

public enum ERole {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_TEACHER("ROLE_TEACHER"),
    ROLE_STUDENT("ROLE_STUDENT"),
    ROLE_USER("ROLE_USER"),
    ROLE_UNASSIGNED("ROLE_UNASSIGNED");

    private final String role;

    ERole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }

    public static ERole fromString(String role) {
        for (ERole eRole : ERole.values()) {
            if (eRole.toString().equalsIgnoreCase(role)) {
                return eRole;
            }
        }
        throw new IllegalArgumentException("No enum constant ERole." + role);
    }

    public String getName() {
        return this.role;
    }
}
