/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoadBalance;

/**
 *
 * @author ce.christian
 */
public class LoadBalance {

  private static Logger log = LoggerFactory.getLogger(SayHelloApplication.class);
  public static void main(String[] args) {
    SpringApplication.run(SayHelloApplication.class, args);
  }

  @GetMapping("/greeting")
  public String greet() {
  log.info("Access /greeting");

  List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
  Random rand = new Random();

  int randomNum = rand.nextInt(greetings.size());
  return greetings.get(randomNum);
  }

  @GetMapping("/")
  public String home() {
  log.info("Access /");
  return "Hi!";
  }
}
