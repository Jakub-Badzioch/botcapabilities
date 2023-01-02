package pl.akademiaprogramowania.botcapabilities.command.rule;

import discord4j.core.object.entity.Message;

public interface CommandRule {

    boolean matches(Message message);

    String apply(Message message);
}
