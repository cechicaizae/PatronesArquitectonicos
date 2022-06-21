/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceRegistry;
@SpringBootApplication
@EnableEurekaServer
/**
 *
 * @author ce.christian
 */
public class ServiceRegistry {
        new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);

}
