package zhamao.route.buildings;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RouteBuildings implements ModInitializer {
	public static final String MOD_ID = "route-buildings";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("\n"+
				"╔═╗╦ ╦╔═╗╔╦╗╔═╗╔═╗  ╦═╗╔═╗╦ ╦╔╦╗╔═╗  ╔╗ ╦ ╦╦╦  ╔╦╗╦╔╗╔╔═╗\n" +
				"╔═╝╠═╣╠═╣║║║╠═╣║ ║  ╠╦╝║ ║║ ║ ║ ║╣   ╠╩╗║ ║║║   ║║║║║║║ ╦\n" +
				"╚═╝╩ ╩╩ ╩╩ ╩╩ ╩╚═╝  ╩╚═╚═╝╚═╝ ╩ ╚═╝  ╚═╝╚═╝╩╩═╝═╩╝╩╝╚╝╚═╝");
		LOGGER.info("Success Loading ROUTE BUILDING.");
	}
}