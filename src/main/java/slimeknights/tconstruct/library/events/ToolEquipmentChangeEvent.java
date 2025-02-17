package slimeknights.tconstruct.library.events;

import lombok.Getter;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import slimeknights.mantle.lib.util.MantleEvent;
import slimeknights.tconstruct.library.tools.context.EquipmentChangeContext;

/** Event fired at the end of {@link EquipmentChangeContext}, contains parsed Tinker Tools for all armor and also fires on the client */
public class ToolEquipmentChangeEvent extends MantleEvent.EntityEvent {
  public static Event<ToolEquip> EVENT = EventFactory.createArrayBacked(ToolEquip.class, callbacks -> event -> {
    for(ToolEquip e : callbacks)
      e.onToolEquip(event);
  });

  @Getter
  private final EquipmentChangeContext context;
  public ToolEquipmentChangeEvent(EquipmentChangeContext context) {
    super(context.getEntity());
    this.context = context;
  }

  @Override
  public void sendEvent() {
    EVENT.invoker().onToolEquip(this);
  }

  @FunctionalInterface
  public interface ToolEquip {
    void onToolEquip(ToolEquipmentChangeEvent event);
  }
}
