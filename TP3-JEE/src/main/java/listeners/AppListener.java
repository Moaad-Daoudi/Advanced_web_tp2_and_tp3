package listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import metiers.UserService;

@WebListener
public class AppListener implements ServletContextListener {
	@Override
    public void contextInitialized(ServletContextEvent sce) {
        UserService metier = new UserService();
        sce.getServletContext().setAttribute("userService", metier);
    }
}
