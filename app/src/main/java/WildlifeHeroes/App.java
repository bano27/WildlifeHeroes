/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package WildlifeHeroes;

import models.Animal;
import models.EndangeredSpecies;
import models.Ranger;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "layout.hbs");
        }, new HandlebarsTemplateEngine());
        get("/Animal", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "Animal.hbs");
        }, new HandlebarsTemplateEngine());
        get("/Rangers", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "Rangers.hbs");
        }, new HandlebarsTemplateEngine());
        get("/AnimalForm", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "AnimalForm.hbs");
        }, new HandlebarsTemplateEngine());
        get("/EndangeredAnimalForm", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "EndangeredAnimalForm.hbs");
        }, new HandlebarsTemplateEngine());
        get("/RangerForm", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "RangerForm.hbs");
        }, new HandlebarsTemplateEngine());
        post("/Animal", (request, respones) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String speciesName = request.queryParams("speciesName");
            request.session().attribute("speciesName", speciesName);
            model.put("speciesName", speciesName);
            String location = request.queryParams("spottedAt");
            request.session().attribute("Spotted_At", location);
            model.put("spottedAt", location);
            Animal animal = new Animal(speciesName, location);
            model.put("Animal", animal.all());

            return new ModelAndView(model, "Animal.hbs");
        }, new HandlebarsTemplateEngine());
        post("/Rangers", (request, respones) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String rangersName = request.queryParams("rangerName");
            request.session().attribute("rangerName", rangersName);
            model.put("rangerName", rangersName);
            String gender = request.queryParams("Gender");
            request.session().attribute("Gender", gender);
            model.put("Gender", gender);
            int age = Integer.parseInt(request.queryParams("Age"));
            request.session().attribute("Age", age);
            model.put("Age", age);
            Ranger ranger = new Ranger(rangersName, gender, age);
            model.put("Rangers", ranger.getInstances());

            return new ModelAndView(model, "Rangers.hbs");
        }, new HandlebarsTemplateEngine());
        post("/Animal", (request, respones) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String endangeredSpeciesName = request.queryParams("species_name");
            request.session().attribute("species_name", endangeredSpeciesName);
            model.put("species_name", endangeredSpeciesName);
            String endangeredLocation = request.queryParams("Spotted_At");
            request.session().attribute("Spotted_At", endangeredLocation);
            model.put("Spotted_At", endangeredLocation);
            String endangeredAge = request.queryParams("Age");
            request.session().attribute("Age", endangeredAge);
            model.put("Age", endangeredAge);
            String endangeredHealth = request.queryParams("Health");
            request.session().attribute("Health", endangeredHealth);
            model.put("Health", endangeredHealth);
            EndangeredSpecies endangeredSpecies = new EndangeredSpecies(endangeredSpeciesName, endangeredLocation, endangeredAge, endangeredHealth);
            model.put("EndangeredSpecies", endangeredSpecies.getInstances());

            return new ModelAndView(model, "Animal.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
