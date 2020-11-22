package com.menino.pokedexapi.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonList {

	//Cria a lista com todos os Pokémon
	public List<Pokemon> createList(){
		List<Pokemon> list = new ArrayList<Pokemon>(Arrays.asList(

				//Lista de Pokémon da segunda geração

				new Pokemon(1, "Bulbasaur", Description.BULBASAUR.description, "Grama", "Venenoso"),
				new Pokemon(2, "Ivysaur", Description.IVYSAUR.description, "Grama", "Venenoso"),
				new Pokemon(3, "Venusaur", Description.VENUSAUR.description, "Grama", "Venenoso"),
				new Pokemon(4, "Charmander", Description.CHARMANDER.description, "Fogo", null),
				new Pokemon(5, "Charmeleon", Description.CHARMELEON.description, "Fogo", null),
				new Pokemon(6, "Charizard", Description.CHARIZARD.description, "Fogo", "Voador"),
				new Pokemon(7, "Squirtle", Description.SQUIRTLE.description, "Água", null),
				new Pokemon(8, "Wartortle", Description.WARTORTLE.description, "Água", null),
				new Pokemon(9, "Blastoise", Description.BLASTOISE.description, "Água", null),
				new Pokemon(10, "Caterpie", Description.CATERPIE.description, "Inseto", null),
				new Pokemon(11, "Metapod", Description.METAPOD.description, "Inseto", null),
				new Pokemon(12, "Butterfree", Description.BUTTERFREE.description, "Inseto", "Venenoso"),
				new Pokemon(13, "Weedle", Description.WEEDLE.description, "Inseto", "Venenoso"),
				new Pokemon(14, "Kakuna", Description.KAKUNA.description, "Inseto", "Venenoso"),
				new Pokemon(15, "Beedrill", Description.BEEDRILL.description, "Inseto", "Venenoso"),
				new Pokemon(16, "Pidgey", Description.PIDGEY.description, "Voador", "Normal"),
				new Pokemon(17, "Pidgeotto", Description.PIDGEOTTO.description, "Voador", "Normal"),
				new Pokemon(18, "Pidgeot", Description.PIDGEOT.description, "Voador", "Normal"),
				new Pokemon(19, "Rattata", Description.RATTATA.description, "Normal", null),
				new Pokemon(20, "Raticate", Description.RATICATE.description, "Normal", null),
				new Pokemon(21, "Spearow", Description.SPEAROW.description, "Voador", "Normal"),
				new Pokemon(22, "Fearow", Description.FEAROW.description, "Voador", "Normal"),
				new Pokemon(23, "Ekans", Description.EKANS.description,"Venenoso", null),
				new Pokemon(24, "Arbok", Description.ARBOK.description,"Venenoso", null),
				new Pokemon(25, "Pikachu", Description.PIKACHU.description,"Elétrico", null),
				new Pokemon(26, "Raichu", Description.RAICHU.description,"Elétrico", null),
				new Pokemon(27, "Sandshrew", Description.SANDSHREW.description,"Terra", null),
				new Pokemon(28, "Sandslash", Description.SANDSLASH.description,"Terra", null),
				new Pokemon(29, "Nidoran ♀", Description.NIDORANF.description,"Venenoso", null),
				new Pokemon(30, "Nidorina", Description.NIDORINA.description,"Venenoso", null),
				new Pokemon(31, "Nidoqueen", Description.NIDOQUEEN.description,"Venenoso", "Terra"),
				new Pokemon(32, "Nidoran ♂", Description.NIDORANM.description,"Venenoso", null),
				new Pokemon(33, "Nidorino", Description.NIDORINO.description,"Venenoso", null),
				new Pokemon(34, "Nidoking", Description.NIDOKING.description,"Venenoso", "Terra"),
				new Pokemon(35, "Clefairy", Description.CLEFAIRY.description,"Fada", null),
				new Pokemon(36, "Clefable", Description.CLEFABLE.description,"Fada", null),
				new Pokemon(37, "Vulpix", Description.VULPIX.description, "Fogo", null),
				new Pokemon(38, "Ninetales", Description.NINETALES.description, "Fogo", null),
				new Pokemon(39, "Jigglypuff", Description.JIGGLYPUFF.description, "Normal", "Fada"),
				new Pokemon(40, "Wigglytuff", Description.WIGGLYTUFF.description, "Normal", "Fada"),
				new Pokemon(41, "Zubat", Description.ZUBAT.description, "Venenoso", "Voador"),
				new Pokemon(42, "Golbat", Description.GOLBAT.description, "Venenoso", "Voador"),
				new Pokemon(43, "Oddish", Description.ODDISH.description, "Grama", "Venenoso"),
				new Pokemon(44, "Gloom", Description.GLOOM.description, "Grama", "Venenoso"),
				new Pokemon(45, "Vileplume", Description.VILEPLUME.description, "Grama", "Venenoso"),
				new Pokemon(46, "Paras", Description.PARAS.description, "Inseto", "Grama"),
				new Pokemon(47, "Parasect", Description.PARASECT.description, "Inseto", "Grama"),
				new Pokemon(48, "Venonat", Description.VENONAT.description, "Inseto", "Venenoso"),
				new Pokemon(49, "Venomoth", Description.VENOMOTH.description, "Inseto", "Venenoso"),
				new Pokemon(50, "Diglett", Description.DIGLETT.description, "Terra", null),
				new Pokemon(51, "Dugtrio", Description.DUGTRIO.description, "Terra", null),
				new Pokemon(52, "Meowth", Description.MEOWTH.description, "Normal", null),
				new Pokemon(53, "Persian", Description.PERSIAN.description, "Normal", null),
				new Pokemon(54, "Psyduck", Description.PSYDUCK.description, "Água", null),
				new Pokemon(55, "Golduck", Description.GOLDUCK.description, "Água", null),
				new Pokemon(56, "Mankey", Description.MANKEY.description, "Lutador", null),
				new Pokemon(57, "Primeape", Description.PRIMEAPE.description, "Lutador", null),
				new Pokemon(58, "Growlithe", Description.GROWLITHE.description, "Fogo", null),
				new Pokemon(59, "Arcanine", Description.ARCANINE.description, "Fogo", null),
				new Pokemon(60, "Poliwag", Description.POLIWAG.description, "Água", null),
				new Pokemon(61, "Poliwhirl", Description.POLIWHIRL.description, "Água", null),
				new Pokemon(62, "Poliwrath", Description.POLIWRATH.description, "Água", "Lutador"),
				new Pokemon(63, "Abra", Description.ABRA.description, "Psíquico", null),
				new Pokemon(64, "Kadabra", Description.KADABRA.description, "Psíquico", null),
				new Pokemon(65, "Alakazam", Description.ALAKAZAM.description, "Psíquico", null),
				new Pokemon(66, "Machop", Description.MACHOP.description, "Lutador", null),
				new Pokemon(67, "Machoke", Description.MACHOKE.description, "Lutador", null),
				new Pokemon(68, "Machamp", Description.MACHAMP.description, "Lutador", null),
				new Pokemon(69, "Bellsprout", Description.BELLSPROUT.description, "Grama", "Venenoso"),
				new Pokemon(70, "Weepinbell", Description.WEEPINBELL.description, "Grama", "Venenoso"),
				new Pokemon(71, "Victreebel", Description.VICTREEBELL.description, "Grama", "Venenoso"),
				new Pokemon(72, "Tentacool", Description.TENTACOOL.description, "Água", "Venenoso"),
				new Pokemon(73, "Tentacruel", Description.TENTACRUEL.description, "Água", "Venenoso"),
				new Pokemon(74, "Geodude", Description.GEODUDE.description, "Pedra", "Terra"),
				new Pokemon(75, "Graveler", Description.GRAVELER.description, "Pedra", "Terra"),
				new Pokemon(76, "Golem", Description.GOLEM.description, "Pedra", "Terra"),
				new Pokemon(77, "Ponyta", Description.PONYTA.description, "Fogo", null),
				new Pokemon(78, "Rapidash", Description.RAPIDASH.description, "Fogo", null),
				new Pokemon(79, "Slowpoke", Description.SLOWPOKE.description, "Água", "Psíquico"),
				new Pokemon(80, "Slowbro", Description.SLOWBRO.description, "Água", "Psíquico"),
				new Pokemon(81, "Magnemite", Description.MAGNEMITE.description, "Elétrico", "Metal"),
				new Pokemon(82, "Magneton", Description.MAGNETON.description, "Elétrico", "Metal"),
				new Pokemon(83, "Farfetch'd", Description.FARFETCHD.description, "Normal", "Voador"),
				new Pokemon(84, "Doduo", Description.DODUO.description, "Normal", "Voador"),
				new Pokemon(85, "Dodrio", Description.DODRIO.description, "Normal", "Voador"),
				new Pokemon(86, "Seel", Description.SEEL.description, "Água", null),
				new Pokemon(87, "Dewgong", Description.DEWGONG.description, "Água", "Gelo"),
				new Pokemon(88, "Grimer", Description.GRIMER.description, "Venenoso", null),
				new Pokemon(89, "Muk", Description.MUK.description, "Venenoso", null),
				new Pokemon(90, "Shellder", Description.SHELLDER.description, "Água", null),
				new Pokemon(91, "Cloyster", Description.CLOYSTER.description, "Água", "Gelo"),
				new Pokemon(92, "Gastly", Description.GASTLY.description, "Fantasma", "Venenoso"),
				new Pokemon(93, "Haunter", Description.HAUNTER.description, "Fantasma", "Venenoso"),
				new Pokemon(94, "Gengar", Description.GENGAR.description, "Fantasma", "Venenoso"),
				new Pokemon(95, "Onix", Description.ONIX.description, "Pedra", "Terra"),
				new Pokemon(96, "Drowzee", Description.DROWZEE.description, "Psíquico", null),
				new Pokemon(97, "Hypno", Description.HYPNO.description, "Psíquico", null),
				new Pokemon(98, "Krabby", Description.KRABBY.description, "Água", null),
				new Pokemon(99, "Kingler", Description.KINGLER.description, "Água", null),
				new Pokemon(100, "Voltorb", Description.VOLTORB.description, "Elétrico", null),
				new Pokemon(101, "Electrode", Description.ELECTRODE.description, "Elétrico", null),
				new Pokemon(102, "Exeggcute", Description.EXEGGCUTE.description, "Grama", "Psíquico"),
				new Pokemon(103, "Exeggutor", Description.EXEGGUTOR.description, "Grama", "Psíquico"),
				new Pokemon(104, "Cubone", Description.CUBONE.description, "Terra", null),
				new Pokemon(105, "Marowak", Description.MAROWAK.description, "Terra", null),
				new Pokemon(106, "Hitmonlee", Description.HITMONLEE.description, "Lutador", null),
				new Pokemon(107, "Hitmonchan", Description.HITMONCHAN.description, "Lutador", null),
				new Pokemon(108, "Lickitung", Description.LICKITUNG.description, "Normal", null),
				new Pokemon(109, "Koffing", Description.KOFFING.description, "Venenoso", null),
				new Pokemon(110, "Weezing", Description.WEEZING.description, "Venenoso", null),
				new Pokemon(111, "Rhyhorn", Description.RHYHORN.description, "Terra", "Pedra"),
				new Pokemon(112, "Rhydon", Description.RHYDON.description, "Terra", "Pedra"),
				new Pokemon(113, "Chansey", Description.CHANSEY.description, "Normal", null),
				new Pokemon(114, "Tangela", Description.TANGELA.description, "Grama", null),
				new Pokemon(115, "Kangaskhan", Description.KANGASKHAN.description, "Normal", null),
				new Pokemon(116, "Horsea", Description.HORSEA.description, "Água", null),
				new Pokemon(117, "Seadra", Description.SEADRA.description, "Água", null),
				new Pokemon(118, "Goldeen", Description.GOLDEEN.description, "Água", null),
				new Pokemon(119, "Seaking", Description.SEAKING.description, "Água", null),
				new Pokemon(120, "Staryu", Description.STARYU.description, "Água", null),
				new Pokemon(121, "Starmie", Description.STARMIE.description, "Água", "Psíquico"),
				new Pokemon(122, "Mr. Mime", Description.MRMIME.description, "Psíquico", "Fada"),
				new Pokemon(123, "Scyther", Description.SCYTHER.description, "Inseto", "Voador"),
				new Pokemon(124, "Jynx", Description.JYNX.description, "Gelo", "Psíquico"),
				new Pokemon(125, "Electabuzz", Description.ELECTABUZZ.description, "Elétrico", null),
				new Pokemon(126, "Magmar", Description.MAGMAR.description, "Fogo", null),
				new Pokemon(127, "Pinsir", Description.PINSIR.description, "Inseto", null),
				new Pokemon(128, "Tauros", Description.TAUROS.description, "Normal", null),
				new Pokemon(129, "Magikarp", Description.MAGIKARP.description, "Água", null),
				new Pokemon(130, "Gyarados", Description.GYARADOS.description, "Água", "Voador"),
				new Pokemon(131, "Lapras", Description.LAPRAS.description, "Água", "Gelo"),
				new Pokemon(132, "Ditto", Description.DITTO.description, "Normal", null),
				new Pokemon(133, "Eevee", Description.EEVEE.description, "Normal", null),
				new Pokemon(134, "Vaporeon", Description.VAPOREON.description, "Água", null),
				new Pokemon(135, "Jolteon", Description.JOLTEON.description, "Elétrico", null),
				new Pokemon(136, "Flareon", Description.FLAREON.description, "Fogo", null),
				new Pokemon(137, "Porygon", Description.PORYGON.description, "Normal", null),
				new Pokemon(138, "Omanyte", Description.OMANYTE.description, "Pedra", "Água"),
				new Pokemon(139, "Omastar", Description.OMASTAR.description, "Pedra", "Água"),
				new Pokemon(140, "Kabuto", Description.KABUTO.description, "Pedra", "Água"),
				new Pokemon(141, "Kabutops", Description.KABUTOPS.description, "Pedra", "Água"),
				new Pokemon(142, "Aerodactyl", Description.AERODACTYL.description, "Pedra", "Voador"),
				new Pokemon(143, "Snorlax", Description.SNORLAX.description, "Normal", null),
				new Pokemon(144, "Articuno", Description.ARTICUNO.description, "Gelo", "Voador"),
				new Pokemon(145, "Zapdos", Description.ZAPDOS.description, "Elétrico", "Voador"),
				new Pokemon(146, "Moltres", Description.MOLTRES.description, "Fogo", "Voador"),
				new Pokemon(147, "Dratini", Description.DRATINI.description, "Dragão", null),
				new Pokemon(148, "Dragonair", Description.DRAGONAIR.description, "Dragão", null),
				new Pokemon(149, "Dragonite", Description.DRAGONITE.description, "Dragão", null),
				new Pokemon(150, "Mewtwo", Description.MEWTWO.description, "Psíquico", null),
				new Pokemon(151, "Mew", Description.MEW.description, "Psíquico", null),

				//Lista de Pokémon da segunda geração

				new Pokemon(152, "Chikorita", Description.CHIKORITA.description, "Grama", null),
				new Pokemon(153, "Bayleef", Description.BAYLEEF.description, "Grama", null),
				new Pokemon(154, "Meganium", Description.MEGANIUM.description, "Grama", null),
				new Pokemon(155, "Cyndaquil", Description.CYNDAQUIL.description, "Fogo", null),
				new Pokemon(156, "Quilava", Description.QUILAVA.description, "Fogo", null),
				new Pokemon(157, "Typhlosion", Description.TYPHLOSION.description, "Fogo", null),
				new Pokemon(158, "Totodile", Description.TOTODILE.description, "Água", null),
				new Pokemon(159, "Croconaw", Description.CROCONAW.description, "Água", null),
				new Pokemon(160, "Feraligatr", Description.FERALIGATR.description, "Água", null),
				new Pokemon(161, "Sentret", Description.SENTRET.description, "Normal", null),
				new Pokemon(162, "Furret", Description.FURRET.description, "Normal", null),
				new Pokemon(163, "Hoothoot", Description.HOOTHOOT.description, "Normal", "Voador"),
				new Pokemon(164, "Noctowl", Description.NOCTOWL.description, "Normal", "Voador"),
				new Pokemon(165, "Ledyba", Description.LEDYBA.description, "Inseto", "Voador"),
				new Pokemon(166, "Ledian", Description.LEDIAN.description, "Inseto", "Voador"),
				new Pokemon(167, "Spinarak", Description.SPINARAK.description, "Inseto", "Venenoso"),
				new Pokemon(168, "Ariados", Description.ARIADOS.description, "Inseto", "Venenoso"),
				new Pokemon(169, "Crobat", Description.CROBAT.description, "Venenoso", "Voador"),
				new Pokemon(170, "Chinchou", Description.CHINCHOU.description, "Água", "Elétrico"),
				new Pokemon(171, "Lanturn", Description.LANTURN.description, "Água", "Elétrico"),
				new Pokemon(172, "Pichu", Description.PICHU.description, "Elétrico", null),
				new Pokemon(173, "Cleffa", Description.CLEFFA.description, "Fada", null),
				new Pokemon(174, "Igglybuff", Description.IGGLYBUFF.description, "Normal", "Fada"),
				new Pokemon(175, "Togepi", Description.TOGEPI.description, "Fada", null),
				new Pokemon(176, "Togetic", Description.TOGETIC.description, "Fada", "Voador"),
				new Pokemon(177, "Natu", Description.NATU.description, "Psíquico", "Voador"),
				new Pokemon(178, "Xatu", Description.XATU.description, "Psíquico", "Voador"),
				new Pokemon(179, "Mareep", Description.MAREEP.description, "Elétrico", null),
				new Pokemon(180, "Flaaffy", Description.FLAAFFY.description, "Elétrico", null),
				new Pokemon(181, "Ampharos", Description.AMPHAROS.description, "Elétrico", null),
				new Pokemon(182, "Bellossom", Description.BELLOSSOM.description, "Grama", null),
				new Pokemon(183, "Marill", Description.MARILL.description, "Água", "Fada"),
				new Pokemon(184, "Azumarill", Description.AZUMARILL.description, "Água", "Fada"),
				new Pokemon(185, "Sudowoodo", Description.SUDOWOODO.description, "Pedra", null),
				new Pokemon(186, "Politoed", Description.POLITOED.description, "Água", null),
				new Pokemon(187, "Hoppip", Description.HOPPIP.description, "Grama", "Voador"),
				new Pokemon(188, "Skiploom", Description.SKIPLOOM.description, "Grama", "Voador"),
				new Pokemon(189, "Jumpluff", Description.JUMPLUFF.description, "Grama", "Voador"),
				new Pokemon(190, "Aipom", Description.AIPOM.description, "Normal", null),
				new Pokemon(191, "Sunkern", Description.SUNKERN.description, "Grama", null),
				new Pokemon(192, "Sunflora", Description.SUNFLORA.description, "Grama", null),
				new Pokemon(193, "Yanma", Description.YANMA.description, "Inseto", "Voador"),
				new Pokemon(194, "Wooper", Description.WOOPER.description, "Água", "Terra"),
				new Pokemon(195, "Quagsire", Description.QUAGSIRE.description, "Água", "Terra"),
				new Pokemon(196, "Espeon", Description.ESPEON.description, "Psíquico", null),
				new Pokemon(197, "Umbreon", Description.UMBREON.description, "Sombra", null),
				new Pokemon(198, "Murkrow", Description.MURKROW.description, "Sombra", "Voador"),
				new Pokemon(199, "Slowking", Description.SLOWKING.description, "Água", "Psíquico"),
				new Pokemon(200, "Misdreavus", Description.MISDREAVUS.description, "Fantasma", null),
				new Pokemon(201, "Unown", Description.UNOWN.description, "Psíquico", null),
				new Pokemon(202, "Wobbuffet", Description.WOBBUFFET.description, "Psíquico", null),
				new Pokemon(203, "Girafarig", Description.GIRAFARIG.description, "Normal", "Psíquico"),
				new Pokemon(204, "Pineco", Description.PINECO.description, "Inseto", null),
				new Pokemon(205, "Forretress", Description.FORRETRESS.description, "Inseto", "Metal"),
				new Pokemon(206, "Dunsparce", Description.DUNSPARCE.description, "Normal", null),
				new Pokemon(207, "Gligar", Description.GLIGAR.description, "Terra", "Voador"),
				new Pokemon(208, "Steelix", Description.STEELIX.description, "Metal", "Terra"),
				new Pokemon(209, "Snubbull", Description.SNUBBULL.description, "Fada", null),
				new Pokemon(210, "Granbull", Description.GRANBULL.description, "Fada", null),
				new Pokemon(211, "Qwilfish", Description.QWILFISH.description, "Água", "Venenoso"),
				new Pokemon(212, "Scizor", Description.SCIZOR.description, "Inseto", "Metal"),
				new Pokemon(213, "Shuckle", Description.SHUCKLE.description, "Inseto", "Pedra"),
				new Pokemon(214, "Heracross", Description.HERACROSS.description, "Inseto", "Lutador"),
				new Pokemon(215, "Sneasel", Description.SNEASEL.description, "Sombra", "Gelo"),
				new Pokemon(216, "Teddiursa", Description.TEDDIURSA.description, "Normal", null),
				new Pokemon(217, "Ursaring", Description.URSARING.description, "Normal", null),
				new Pokemon(218, "Slugma", Description.SLUGMA.description, "Fogo", null),
				new Pokemon(219, "Magcargo", Description.MAGCARGO.description, "Fogo", "Pedra"),
				new Pokemon(220, "Swinub", Description.SWINUB.description, "Gelo", "Terra"),
				new Pokemon(221, "Piloswine", Description.PILOSWINE.description, "Gelo", "Terra"),
				new Pokemon(222, "Corsola", Description.CORSOLA.description, "Água", "Pedra"),
				new Pokemon(223, "Remoraid", Description.REMORAID.description, "Água", null),
				new Pokemon(224, "Octillery", Description.OCTILLERY.description, "Água", null),
				new Pokemon(225, "Delibird", Description.DELIBIRD.description, "Gelo", "Voador"),
				new Pokemon(226, "Mantine", Description.MANTINE.description, "Água", "Voador"),
				new Pokemon(227, "Skarmory", Description.SKARMORY.description, "Metal", "Voador"),
				new Pokemon(228, "Houndour", Description.HOUNDOUR.description, "Sombra", "Fogo"),
				new Pokemon(229, "Houndoom", Description.HOUNDOOM.description, "Sombra", "Fogo"),
				new Pokemon(230, "Kingdra", Description.KINGDRA.description, "Água", "Dragão"),
				new Pokemon(231, "Phanpy", Description.PHANPY.description, "Terra", null),
				new Pokemon(232, "Donphan", Description.DONPHAN.description, "Terra", null),
				new Pokemon(233, "Porygon2", Description.PORYGON2.description, "Normal", null),
				new Pokemon(234, "Stantler", Description.STANTLER.description, "Normal", null),
				new Pokemon(235, "Smeargle", Description.SMEARGLE.description, "Normal", null),
				new Pokemon(236, "Tyrogue", Description.TYROGUE.description, "Lutador", null),
				new Pokemon(237, "Hitmontop", Description.HITMONTOP.description, "Lutador", null),
				new Pokemon(238, "Smoochum", Description.SMOOCHUM.description, "Gelo", "Psíquico"),
				new Pokemon(239, "Elekid", Description.ELEKID.description, "Elétrico", null),
				new Pokemon(240, "Magby", Description.MAGBY.description, "Fogo", null),
				new Pokemon(241, "Miltank", Description.MILTANK.description, "Normal", null),
				new Pokemon(242, "Blissey", Description.BLISSEY.description, "Normal", null),
				new Pokemon(243, "Raikou", Description.RAIKOU.description, "Elétrico", null),
				new Pokemon(244, "Entei", Description.ENTEI.description, "Fogo", null),
				new Pokemon(245, "Suicune", Description.SUICUNE.description, "Água", null),
				new Pokemon(246, "Larvitar", Description.LARVITAR.description, "Pedra", "Terra"),
				new Pokemon(247, "Pupitar", Description.PUPITAR.description, "Pedra", "Terra"),
				new Pokemon(248, "Tyranitar", Description.TYRANITAR.description, "Pedra", "Sombra"),
				new Pokemon(249, "Lugia", Description.LUGIA.description, "Psíquico", "Voador"),
				new Pokemon(250, "Ho-Oh", Description.HOOH.description, "Fogo", "Voador"),
				new Pokemon(251, "Celebi", Description.CELEBI.description, "Psíquico", "Grama")));

		return list;
	}
}
