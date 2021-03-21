package clown.company.easyheal;

import org.bukkit.entity.Player;

public class Air
{
    public Air(Player player)
    {
        player.setRemainingAir(player.getMaximumAir());
    }
}
