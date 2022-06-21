/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebHook;
import com.stripe.*;
import com.stripe.exception.StripeException;
import com.stripe.model.WebhookEndpoint;

/**
 *
 * @author ce.christian
 */

public class Webhook {
    public static void main(String[] args) throws StripeException {
    Stripe.apiKey = "sk_test_8davkaTdhXelQXTZaVthSAR";
    List<Object> events = new ArrayList<Object>();
    events.add("charge.succeeded");
    events.add("charge.failed");
    
    Map<String, Object) param = new HashMap<String, Object>();
    param.put("enabled_events",events);
    param.put("url", "https://webhook.site/6771f998-390c-4963-a821-e40289dfcac0");
    
    WebhookEndpoint weEndpoint a HewhookEndpoint.create(param);
    System.out.println(weEndpoint);
}
