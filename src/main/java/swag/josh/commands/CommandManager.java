package swag.josh.commands;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

import java.util.ArrayList;
import java.util.List;

public class CommandManager extends ListenerAdapter {

    // Can have up to 100 commands.
    @Override
    public void onGuildReady(GuildReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();

        // Register Slash Commands
        commandData.add(Commands.slash("example", "yall already know how it is!!!"));



        event.getGuild().updateCommands().addCommands(commandData).queue(); // Saves the commands to the guild (in our case, the entire bot)
    }
}
