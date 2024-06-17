package registerationlogin;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "adminDashboard";
        /*
        String role = getRole();

        System.out.println();
        System.out.println();
        System.out.println(role);
        System.out.println();
        System.out.println();

        return switch (role.toUpperCase()) {
            case "ADMIN" -> "adminDashboard";
            case "TEACHER" -> "roles/teacherDashboard";
            default -> "error";
        };
         */
    }

    private String getRole() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .findFirst()
                .orElse("USER");
    }
}
