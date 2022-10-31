package swag.josh;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import swag.josh.commands.CommandManager;
import swag.josh.commands.ExampleCommand;

public class Main {



    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault("MTAzNjM2MTIwNTMxODY4NDc2Mg.GpC0GQ.4LdkaKCcQ3vFw3ImjiLQdgy2nvy4ZHPnMhV_OY")
                .setActivity(Activity.watching("Square struggle with JDA"))

                .addEventListeners(new CommandManager())
                .addEventListeners(new ExampleCommand())
                ;

        builder.build();
    }

}