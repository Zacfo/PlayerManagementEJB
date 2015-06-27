package com.mathedia.players.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mathedia.players.dto.BasePlayerData;
import com.mathedia.players.models.Player;

@Path("players")
@Stateless
public class PlayerManagementService {
	
	@EJB 
	private PlayerManagementBean playerManagementBean;
	
	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BasePlayerData> getPlayers() {
		return playerManagementBean.getAllPlayers();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Player getPlayer(@PathParam("id") int id) {
		Player player = playerManagementBean.getPlayer(id);
		
		return player;
	}
	
	@PUT
	@Path("update")
	@Produces(MediaType.APPLICATION_JSON)
	public Player updatePlayer(Player player) {
		return playerManagementBean.updatePlayer(player);
	}
	
	@POST
	@Path("create")
	@Produces(MediaType.APPLICATION_JSON)
	public Player createPlayer(Player player) {
		return playerManagementBean.createPlayer(player);
	}
	
	@DELETE
	@Path("delete/{id}")
	public void deletePlayer(@PathParam("id") int playerId) {
		playerManagementBean.deletePlayer(playerId);
	}	

}
