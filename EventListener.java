package com.nicholas.lexicon;

public class EventListener
{
	public EventListener()
	{
		Engine.getInstance().getEventManager().registerEvent("BaseEventData", this);
	}
	
	public void handleEvent(BaseEventData event) {}
};