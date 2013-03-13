package com.github.ujihisa.minecrest

import spray.can.server.SprayCanHttpServerApp
import akka.actor.{Props, Actor, ActorSystem}

/*
case class MockPlayer(name: String, health: Int, foodLevel: Int, exp: Int, totalExperience: Int)
	extends Object
	with org.bukkit.entity.Player {
	def getName = name
	def getHealth = health
	def getFoodLevel = foodLevel
	def getServerName = "dummy"
	def getDisplayName = name
	def getPlayerListName = name
	def getExp = exp
	def getTotalExperience = totalExperience
	def setTexturePack(x$1: java.lang.String) {}
	def getWalkSpeed() = 0.1F
	def getFlySpeed() = 0.1F
	def setWalkSpeed(x$1: Float) {}
	def setFlySpeed(x$1: Float) {}
	def setFlying(x$1: Boolean) {}
	def isFlying() = false
	def canSee(x$1: org.bukkit.entity.Player) = true
	def showPlayer(x$1: org.bukkit.entity.Player) {}
	def hidePlayer(x$1: org.bukkit.entity.Player) {}
	def setAllowFlight(x$1: Boolean) {}
	def getAllowFlight() = true
	def setBedSpawnLocation(x$1: org.bukkit.Location, x$2: Boolean) {}
	def setBedSpawnLocation(x$1: org.bukkit.Location) {}
	def getBedSpawnLocation() = null // org.bukkit.Location is not defined
	def setFoodLevel(x$1: Int) {}
	def setSaturation(x$1: Float) {}
	def getSaturation() = 0.0F
	def setExhaustion(x$1: Float) {}
	def getExhaustion() = 0.0F
	def setTotalExperience(x$1: Int) {}
	def setLevel(x$1: Int) {}
	def getLevel() = 12
	def setExp(x$1: Float) {}
	def giveExpLevels(x$1: Int) {}
	def giveExp(x$1: Int) {}
	def resetPlayerTime() {}
	def isPlayerTimeRelative() = true // ?
	def getPlayerTimeOffset() = 0
	def getPlayerTime() = 123
	def setPlayerTime(x$1: Long, x$2: Boolean) {}
	def incrementStatistic(x$1: org.bukkit.Statistic, x$2: org.bukkit.Material, x$3: Int) {}
	def incrementStatistic(x$1: org.bukkit.Statistic, x$2: org.bukkit.Material) {}
	def incrementStatistic(x$1: org.bukkit.Statistic, x$2: Int) {}
	def incrementStatistic(x$1: org.bukkit.Statistic) {}
	def awardAchievement(x$1: org.bukkit.Achievement) {}
	def updateInventory() {}
	def sendMap(x$1: org.bukkit.map.MapView) {}
	def sendBlockChange(x$1: org.bukkit.Location, x$2: Int, x$3: Byte) {}
	def sendChunkChange(x$1: org.bukkit.Location, x$2: Int, x$3: Int, x$4: Int, x$5: Array[Byte]) = false // ?
	def sendBlockChange(x$1: org.bukkit.Location, x$2: org.bukkit.Material, x$3: Byte) {}
	def playEffect[T](x$1: org.bukkit.Location, x$2: org.bukkit.Effect, x$3: T) {}
	def playEffect(x$1: org.bukkit.Location, x$2: org.bukkit.Effect, x$3: Int) {}
	def playSound(x$1: org.bukkit.Location, x$2: org.bukkit.Sound, x$3: Float, x$4: Float) {}
	def playNote(x$1: org.bukkit.Location, x$2: org.bukkit.Instrument, x$3: org.bukkit.Note) {}
	def playNote(x$1: org.bukkit.Location, x$2: Byte, x$3: Byte) {}
	def isSleepingIgnored() = false // ?
	def setSleepingIgnored(x$1: Boolean) {}
	def loadData() {}
	def saveData() {}
	def setSprinting(x$1: Boolean) {}
	def isSprinting() = false
	def setSneaking(x$1: Boolean) {}
	def isSneaking() = false
	def performCommand(x$1: java.lang.String) = false
	def chat(x$1: java.lang.String) {}
	def kickPlayer(x$1: java.lang.String) {}
	def sendRawMessage(x$1: java.lang.String) {}
	def getAddress(): java.net.InetSocketAddress = null // !
	def getCompassTarget() org.bukkit.Location = null // !
	def setCompassTarget(x$1: org.bukkit.Location) {}
	def setPlayerListName(x$1: java.lang.String) {}
	def setDisplayName(x$1: java.lang.String) {}
	def getListeningPluginChannels in trait PluginMessageRecipient of type ()java.util.Set[java.lang.String] is not defined
	def sendPluginMessage in trait PluginMessageRecipient of type (x$1: org.bukkit.plugin.Plugin, x$2: java.lang.String, x$3: Array[Byte]) {}
	def hasPlayedBefore in trait OfflinePlayer of type ()Boolean is not defined
	def getLastPlayed in trait OfflinePlayer of type ()Long is not defined
	def getFirstPlayed in trait OfflinePlayer of type ()Long is not defined
	def getPlayer in trait OfflinePlayer of type ()org.bukkit.entity.Player is not defined
	def setWhitelisted in trait OfflinePlayer of type (x$1: Boolean) {}
	def isWhitelisted in trait OfflinePlayer of type ()Boolean is not defined
	def setBanned in trait OfflinePlayer of type (x$1: Boolean) {}
	def isBanned in trait OfflinePlayer of type ()Boolean is not defined
	def isOnline in trait OfflinePlayer of type ()Boolean is not defined
	def serialize in trait ConfigurationSerializable of type ()java.util.Map[java.lang.String,java.lang.Object] is not defined
	def getServer in trait CommandSender of type ()org.bukkit.Server is not defined
	def sendMessage in trait CommandSender of type (x$1: Array[java.lang.String]) {}
	def sendMessage in trait CommandSender of type (x$1: java.lang.String) {}
	def abandonConversation in trait Conversable of type (x$1: org.bukkit.conversations.Conversation, x$2: org.bukkit.conversations.ConversationAbandonedEvent) {}
	def abandonConversation in trait Conversable of type (x$1: org.bukkit.conversations.Conversation) {}
	def beginConversation in trait Conversable of type (x$1: org.bukkit.conversations.Conversation)Boolean is not defined
	def acceptConversationInput in trait Conversable of type (x$1: java.lang.String) {}
	def isConversing in trait Conversable of type ()Boolean is not defined
	def getExpToLevel in trait HumanEntity of type ()Int is not defined
	def isBlocking in trait HumanEntity of type ()Boolean is not defined
	def setGameMode in trait HumanEntity of type (x$1: org.bukkit.GameMode) {}
	def getGameMode in trait HumanEntity of type ()org.bukkit.GameMode is not defined
	def getSleepTicks in trait HumanEntity of type ()Int is not defined
	def isSleeping in trait HumanEntity of type ()Boolean is not defined
	def setItemOnCursor in trait HumanEntity of type (x$1: org.bukkit.inventory.ItemStack) {}
	def getItemOnCursor in trait HumanEntity of type ()org.bukkit.inventory.ItemStack is not defined
	def setItemInHand in trait HumanEntity of type (x$1: org.bukkit.inventory.ItemStack) {}
	def getItemInHand in trait HumanEntity of type ()org.bukkit.inventory.ItemStack is not defined
	def closeInventory in trait HumanEntity of type () {}
	def openInventory in trait HumanEntity of type (x$1: org.bukkit.inventory.InventoryView) {}
	def openEnchanting in trait HumanEntity of type (x$1: org.bukkit.Location, x$2: Boolean)org.bukkit.inventory.InventoryView is not defined
	def openWorkbench in trait HumanEntity of type (x$1: org.bukkit.Location, x$2: Boolean)org.bukkit.inventory.InventoryView is not defined
	def openInventory in trait HumanEntity of type (x$1: org.bukkit.inventory.Inventory)org.bukkit.inventory.InventoryView is not defined
	def getOpenInventory in trait HumanEntity of type ()org.bukkit.inventory.InventoryView is not defined
	def setWindowProperty in trait HumanEntity of type (x$1: org.bukkit.inventory.InventoryView.Property, x$2: Int)Boolean is not defined
	def getEnderChest in trait HumanEntity of type ()org.bukkit.inventory.Inventory is not defined
	def getInventory in trait HumanEntity of type ()org.bukkit.inventory.PlayerInventory is not defined
	def getEffectivePermissions in trait Permissible of type ()java.util.Set[org.bukkit.permissions.PermissionAttachmentInfo] is not defined
	def recalculatePermissions in trait Permissible of type () {}
	def removeAttachment in trait Permissible of type (x$1: org.bukkit.permissions.PermissionAttachment) {}
	def addAttachment in trait Permissible of type (x$1: org.bukkit.plugin.Plugin, x$2: Int)org.bukkit.permissions.PermissionAttachment is not defined
	def addAttachment in trait Permissible of type (x$1: org.bukkit.plugin.Plugin, x$2: java.lang.String, x$3: Boolean, x$4: Int)org.bukkit.permissions.PermissionAttachment is not defined
	def addAttachment in trait Permissible of type (x$1: org.bukkit.plugin.Plugin)org.bukkit.permissions.PermissionAttachment is not defined
	def addAttachment in trait Permissible of type (x$1: org.bukkit.plugin.Plugin, x$2: java.lang.String, x$3: Boolean)org.bukkit.permissions.PermissionAttachment is not defined
	def hasPermission in trait Permissible of type (x$1: org.bukkit.permissions.Permission)Boolean is not defined
	def hasPermission in trait Permissible of type (x$1: java.lang.String)Boolean is not defined
	def isPermissionSet in trait Permissible of type (x$1: org.bukkit.permissions.Permission)Boolean is not defined
	def isPermissionSet in trait Permissible of type (x$1: java.lang.String)Boolean is not defined
	def setOp in trait ServerOperator of type (x$1: Boolean) {}
	def isOp in trait ServerOperator of type ()Boolean is not defined
	def getCanPickupItems in trait LivingEntity of type ()Boolean is not defined
	def setCanPickupItems in trait LivingEntity of type (x$1: Boolean) {}
	def getEquipment in trait LivingEntity of type ()org.bukkit.inventory.EntityEquipment is not defined
	def setRemoveWhenFarAway in trait LivingEntity of type (x$1: Boolean) {}
	def getRemoveWhenFarAway in trait LivingEntity of type ()Boolean is not defined
	def hasLineOfSight in trait LivingEntity of type (x$1: org.bukkit.entity.Entity)Boolean is not defined
	def getActivePotionEffects in trait LivingEntity of type ()java.util.Collection[org.bukkit.potion.PotionEffect] is not defined
	def removePotionEffect in trait LivingEntity of type (x$1: org.bukkit.potion.PotionEffectType) {}
	def hasPotionEffect in trait LivingEntity of type (x$1: org.bukkit.potion.PotionEffectType)Boolean is not defined
	def addPotionEffects in trait LivingEntity of type (x$1: java.util.Collection[org.bukkit.potion.PotionEffect])Boolean is not defined
	def addPotionEffect in trait LivingEntity of type (x$1: org.bukkit.potion.PotionEffect, x$2: Boolean)Boolean is not defined
	def addPotionEffect in trait LivingEntity of type (x$1: org.bukkit.potion.PotionEffect)Boolean is not defined
	def getKiller in trait LivingEntity of type ()org.bukkit.entity.Player is not defined
	def setNoDamageTicks in trait LivingEntity of type (x$1: Int) {}
	def getNoDamageTicks in trait LivingEntity of type ()Int is not defined
	def setLastDamage in trait LivingEntity of type (x$1: Int) {}
	def getLastDamage in trait LivingEntity of type ()Int is not defined
	def setMaximumNoDamageTicks in trait LivingEntity of type (x$1: Int) {}
	def getMaximumNoDamageTicks in trait LivingEntity of type ()Int is not defined
	def setMaximumAir in trait LivingEntity of type (x$1: Int) {}
	def getMaximumAir in trait LivingEntity of type ()Int is not defined
	def setRemainingAir in trait LivingEntity of type (x$1: Int) {}
	def getRemainingAir in trait LivingEntity of type ()Int is not defined
	def launchProjectile in trait LivingEntity of type [T <: org.bukkit.entity.Projectile](x$1: java.lang.Class[_ <: T])T is not defined
	def shootArrow in trait LivingEntity of type ()org.bukkit.entity.Arrow is not defined
	def throwSnowball in trait LivingEntity of type ()org.bukkit.entity.Snowball is not defined
	def throwEgg in trait LivingEntity of type ()org.bukkit.entity.Egg is not defined
	def getLastTwoTargetBlocks in trait LivingEntity of type (x$1: java.util.HashSet[java.lang.Byte], x$2: Int)java.util.List[org.bukkit.block.Block] is not defined
	def getTargetBlock in trait LivingEntity of type (x$1: java.util.HashSet[java.lang.Byte], x$2: Int)org.bukkit.block.Block is not defined
	def getLineOfSight in trait LivingEntity of type (x$1: java.util.HashSet[java.lang.Byte], x$2: Int)java.util.List[org.bukkit.block.Block] is not defined
	def getEyeLocation in trait LivingEntity of type ()org.bukkit.Location is not defined
	def getEyeHeight in trait LivingEntity of type (x$1: Boolean)Double is not defined
	def getEyeHeight in trait LivingEntity of type ()Double is not defined
	def resetMaxHealth in trait Damageable of type () {}
	def setMaxHealth in trait Damageable of type (x$1: Int) {}
	def getMaxHealth in trait Damageable of type ()Int is not defined
	def setHealth in trait Damageable of type (x$1: Int) {}
	def damage in trait Damageable of type (x$1: Int, x$2: org.bukkit.entity.Entity) {}
	def damage in trait Damageable of type (x$1: Int) {}
	def getVehicle in trait Entity of type ()org.bukkit.entity.Entity is not defined
	def leaveVehicle in trait Entity of type ()Boolean is not defined
	def isInsideVehicle in trait Entity of type ()Boolean is not defined
	def getType in trait Entity of type ()org.bukkit.entity.EntityType is not defined
	def playEffect in trait Entity of type (x$1: org.bukkit.EntityEffect) {}
	def setTicksLived in trait Entity of type (x$1: Int) {}
	def getTicksLived in trait Entity of type ()Int is not defined
	def getUniqueId in trait Entity of type ()java.util.UUID is not defined
	def getLastDamageCause in trait Entity of type ()org.bukkit.event.entity.EntityDamageEvent is not defined
	def setLastDamageCause in trait Entity of type (x$1: org.bukkit.event.entity.EntityDamageEvent) {}
	def setFallDistance in trait Entity of type (x$1: Float) {}
	def getFallDistance in trait Entity of type ()Float is not defined
	def eject in trait Entity of type ()Boolean is not defined
	def isEmpty in trait Entity of type ()Boolean is not defined
	def setPassenger in trait Entity of type (x$1: org.bukkit.entity.Entity)Boolean is not defined
	def getPassenger in trait Entity of type ()org.bukkit.entity.Entity is not defined
	def isValid in trait Entity of type ()Boolean is not defined
	def isDead in trait Entity of type ()Boolean is not defined
	def remove in trait Entity of type () {}
	def setFireTicks in trait Entity of type (x$1: Int) {}
	def getMaxFireTicks in trait Entity of type ()Int is not defined
	def getFireTicks in trait Entity of type ()Int is not defined
	def getEntityId in trait Entity of type ()Int is not defined
	def getNearbyEntities in trait Entity of type (x$1: Double, x$2: Double, x$3: Double)java.util.List[org.bukkit.entity.Entity] is not defined
	def teleport in trait Entity of type (x$1: org.bukkit.entity.Entity, x$2: org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)Boolean is not defined
	def teleport in trait Entity of type (x$1: org.bukkit.entity.Entity)Boolean is not defined
	def teleport in trait Entity of type (x$1: org.bukkit.Location, x$2: org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)Boolean is not defined
	def teleport in trait Entity of type (x$1: org.bukkit.Location)Boolean is not defined
	def getWorld in trait Entity of type ()org.bukkit.World is not defined
	def getVelocity in trait Entity of type ()org.bukkit.util.Vector is not defined
	def setVelocity in trait Entity of type (x$1: org.bukkit.util.Vector) {}
	def getLocation in trait Entity of type (x$1: org.bukkit.Location)org.bukkit.Location is not defined
	def getLocation in trait Entity of type ()org.bukkit.Location is not defined
	def removeMetadata in trait Metadatable of type (x$1: java.lang.String, x$2: org.bukkit.plugin.Plugin) {}
	def hasMetadata in trait Metadatable of type (x$1: java.lang.String)Boolean is not defined
	def getMetadata in trait Metadatable of type (x$1: java.lang.String)java.util.List[org.bukkit.metadata.MetadataValue] is not defined
	def setMetadata in trait Metadatable of type (x$1: java.lang.String, x$2: org.bukkit.metadata.MetadataValue) {}
}
	*/

class HttpHandler extends Actor {
	import spray.http._
	import spray.http.HttpMethods.{GET}
	import com.codahale.jerkson.Json
	import spray.can.server.HttpServer
	import org.bukkit.Bukkit

	sealed trait Entity
	case class Player(name: String, health: Int) extends Entity
  private val mockOnlinePlayers = List(
    Player("ujm", 2),
    Player("mozukusoba", 20),
    Player("Notch", 100))

	def receive = {
		case HttpRequest(GET, "/alarm", _, _, _) =>
			sender ! HttpResponse(entity = "OK")
			
			/*
		case HttpRequest(GET, "/api/v1/server.json", _, _, _) => {
      val s = Bukkit.getServer

			sender ! jsonResponse(
        Map[String, Map[String, Any]](
          "server" -> Map[String, Any](
            "name"       -> s.getName,
            "serverName" -> s.getServerName,
            "version"    -> s.getVersion,
            "address"    -> ("%s:%s" format (s.getIp, s.getPort)),
            "ip"         -> s.getIp,
            "port"       -> s.getPort
            ),
          "bukkit" -> Map[String, Any](
            "version" -> s.getBukkitVersion,
            "plugins" -> List[String]("TestPlugin1", "TestPlugin2", "TestPlugin3")
            )
          )
        )
		}
			*/

		case HttpRequest(GET, "/api/v1/users/online.json", headers, _, _) => {
			println(GET, "/api/v1/users/online.json", headers)
			sender ! jsonResponse(headers.map { h => (h.name, h.value) }.toMap[String, String].get("callback"), Bukkit.getOnlinePlayers.toList.map { p =>
				Map[String, Any](
					"name"           -> p.getName,
					"displayName"    -> p.getDisplayName,
					"playerListName" -> p.getPlayerListName,
					"health"         -> p.getHealth,
					"currentExp"     -> p.getExp,
					"totalExp"       -> p.getTotalExperience,
					"address"        -> p.getAddress,
					"allowFlight"    -> p.getAllowFlight
        )
			})
		}

		case _: HttpRequest =>
			sender ! HttpResponse(status = 404, entity = "Unknown resource!")

		case HttpServer.Closed(_, reason) =>
			println('closed, reason)

		case e => println("must-not-happen", e)
	}

	// all methods below are mock
	private def jsonResponse(callback: Option[String], x: Any): HttpResponse = {
		val y = callback match {
			case Some(c) => "%s(%s)" format (c, Json.generate(x))
			case _ => Json.generate(x)
		}
		HttpResponse(entity = y)
	}
}

/*
object Main extends App with SprayCanHttpServerApp {
	val handler = system.actorOf(Props[HttpHandler])

	newHttpServer(handler) ! Bind(interface = "localhost", port = 12380)
}
 */

import org.bukkit.plugin.java.JavaPlugin
import com.typesafe.config.ConfigFactory
class Main extends JavaPlugin with SprayCanHttpServerApp {
	//val classLoader = new java.net.URLClassLoader(Array(new java.net.URL("file:///home/share/tough-explosive/plugins/tough-explosive-0.1.0-SNAPSHOT-standalone.jar")))
	//val classLoader = Thread.currentThread.getContextClassLoader
	//val classLoader = ClassLoader.getSystemClassLoader
	val previous = Thread.currentThread.getContextClassLoader
	Thread.currentThread.setContextClassLoader(this.getClass().getClassLoader())
	val system0 = ActorSystem("minecrest")
	val handler = system.actorOf(Props[HttpHandler])
	newHttpServer(handler) ! Bind(interface = "0.0.0.0", port = 12380)
	Thread.currentThread().setContextClassLoader(previous)
	override lazy val system = system0

	override def onEnable {
		println('cool)
	}

	override def onDisable {
		println('bye)
	}
}
