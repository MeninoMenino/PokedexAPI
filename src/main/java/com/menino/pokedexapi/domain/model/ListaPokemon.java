package com.menino.pokedexapi.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaPokemon {

	//Cria a lista com todos os Pokémon
	public List<Pokemon> criarLista(){
		List<Pokemon> lista = new ArrayList<Pokemon>(Arrays.asList(

				//Lista de Pokémon da segunda geração

				new Pokemon(1, "Bulbasaur", Description.BULBASAUR.descricao, "Grama", "Venenoso"),
				new Pokemon(2, "Ivysaur", Description.IVYSAUR.descricao, "Grama", "Venenoso"),
				new Pokemon(3, "Venusaur", Description.VENUSAUR.descricao, "Grama", "Venenoso"),
				new Pokemon(4, "Charmander", Description.CHARMANDER.descricao, "Fogo", null),
				new Pokemon(5, "Charmeleon", Description.CHARMELEON.descricao, "Fogo", null),
				new Pokemon(6, "Charizard", Description.CHARIZARD.descricao, "Fogo", "Voador"),
				new Pokemon(7, "Squirtle", Description.SQUIRTLE.descricao, "Água", null),
				new Pokemon(8, "Wartortle", Description.WARTORTLE.descricao, "Água", null),
				new Pokemon(9, "Blastoise", Description.BLASTOISE.descricao, "Água", null),
				new Pokemon(10, "Caterpie", Description.CATERPIE.descricao, "Inseto", null),
				new Pokemon(11, "Metapod", Description.METAPOD.descricao, "Inseto", null),
				new Pokemon(12, "Butterfree", Description.BUTTERFREE.descricao, "Inseto", "Venenoso"),
				new Pokemon(13, "Weedle", Description.WEEDLE.descricao, "Inseto", "Venenoso"),
				new Pokemon(14, "Kakuna", Description.KAKUNA.descricao, "Inseto", "Venenoso"),
				new Pokemon(15, "Beedrill", Description.BEEDRILL.descricao, "Inseto", "Venenoso"),
				new Pokemon(16, "Pidgey", Description.PIDGEY.descricao, "Voador", "Normal"),
				new Pokemon(17, "Pidgeotto", Description.PIDGEOTTO.descricao, "Voador", "Normal"),
				new Pokemon(18, "Pidgeot", Description.PIDGEOT.descricao, "Voador", "Normal"),
				new Pokemon(19, "Rattata", Description.RATTATA.descricao, "Normal", null),
				new Pokemon(20, "Raticate", Description.RATICATE.descricao, "Normal", null),
				new Pokemon(21, "Spearow", Description.SPEAROW.descricao, "Voador", "Normal"),
				new Pokemon(22, "Fearow", Description.FEAROW.descricao, "Voador", "Normal"),
				new Pokemon(23, "Ekans", Description.EKANS.descricao,"Venenoso", null),
				new Pokemon(24, "Arbok", Description.ARBOK.descricao,"Venenoso", null),
				new Pokemon(25, "Pikachu", Description.PIKACHU.descricao,"Elétrico", null),
				new Pokemon(26, "Raichu", Description.RAICHU.descricao,"Elétrico", null),
				new Pokemon(27, "Sandshrew", Description.SANDSHREW.descricao,"Terra", null),
				new Pokemon(28, "Sandslash", Description.SANDSLASH.descricao,"Terra", null),
				new Pokemon(29, "Nidoran ♀", Description.NIDORANF.descricao,"Venenoso", null),
				new Pokemon(30, "Nidorina", Description.NIDORINA.descricao,"Venenoso", null),
				new Pokemon(31, "Nidoqueen", Description.NIDOQUEEN.descricao,"Venenoso", "Terra"),
				new Pokemon(32, "Nidoran ♂", Description.NIDORANM.descricao,"Venenoso", null),
				new Pokemon(33, "Nidorino", Description.NIDORINO.descricao,"Venenoso", null),
				new Pokemon(34, "Nidoking", Description.NIDOKING.descricao,"Venenoso", "Terra"),
				new Pokemon(35, "Clefairy", Description.CLEFAIRY.descricao,"Fada", null),
				new Pokemon(36, "Clefable", Description.CLEFABLE.descricao,"Fada", null),
				new Pokemon(37, "Vulpix", Description.VULPIX.descricao, "Fogo", null),
				new Pokemon(38, "Ninetales", Description.NINETALES.descricao, "Fogo", null),
				new Pokemon(39, "Jigglypuff", Description.JIGGLYPUFF.descricao, "Normal", "Fada"),
				new Pokemon(40, "Wigglytuff", Description.WIGGLYTUFF.descricao, "Normal", "Fada"),
				new Pokemon(41, "Zubat", Description.ZUBAT.descricao, "Venenoso", "Voador"),
				new Pokemon(42, "Golbat", Description.GOLBAT.descricao, "Venenoso", "Voador"),
				new Pokemon(43, "Oddish", Description.ODDISH.descricao, "Grama", "Venenoso"),
				new Pokemon(44, "Gloom", Description.GLOOM.descricao, "Grama", "Venenoso"),
				new Pokemon(45, "Vileplume", Description.VILEPLUME.descricao, "Grama", "Venenoso"),
				new Pokemon(46, "Paras", Description.PARAS.descricao, "Inseto", "Grama"),
				new Pokemon(47, "Parasect", Description.PARASECT.descricao, "Inseto", "Grama"),
				new Pokemon(48, "Venonat", Description.VENONAT.descricao, "Inseto", "Venenoso"),
				new Pokemon(49, "Venomoth", Description.VENOMOTH.descricao, "Inseto", "Venenoso"),
				new Pokemon(50, "Diglett", Description.DIGLETT.descricao, "Terra", null),
				new Pokemon(51, "Dugtrio", Description.DUGTRIO.descricao, "Terra", null),
				new Pokemon(52, "Meowth", Description.MEOWTH.descricao, "Normal", null),
				new Pokemon(53, "Persian", Description.PERSIAN.descricao, "Normal", null),
				new Pokemon(54, "Psyduck", Description.PSYDUCK.descricao, "Água", null),
				new Pokemon(55, "Golduck", Description.GOLDUCK.descricao, "Água", null),
				new Pokemon(56, "Mankey", Description.MANKEY.descricao, "Lutador", null),
				new Pokemon(57, "Primeape", Description.PRIMEAPE.descricao, "Lutador", null),
				new Pokemon(58, "Growlithe", Description.GROWLITHE.descricao, "Fogo", null),
				new Pokemon(59, "Arcanine", Description.ARCANINE.descricao, "Fogo", null),
				new Pokemon(60, "Poliwag", Description.POLIWAG.descricao, "Água", null),
				new Pokemon(61, "Poliwhirl", Description.POLIWHIRL.descricao, "Água", null),
				new Pokemon(62, "Poliwrath", Description.POLIWRATH.descricao, "Água", "Lutador"),
				new Pokemon(63, "Abra", Description.ABRA.descricao, "Psíquico", null),
				new Pokemon(64, "Kadabra", Description.KADABRA.descricao, "Psíquico", null),
				new Pokemon(65, "Alakazam", Description.ALAKAZAM.descricao, "Psíquico", null),
				new Pokemon(66, "Machop", Description.MACHOP.descricao, "Lutador", null),
				new Pokemon(67, "Machoke", Description.MACHOKE.descricao, "Lutador", null),
				new Pokemon(68, "Machamp", Description.MACHAMP.descricao, "Lutador", null),
				new Pokemon(69, "Bellsprout", Description.BELLSPROUT.descricao, "Grama", "Venenoso"),
				new Pokemon(70, "Weepinbell", Description.WEEPINBELL.descricao, "Grama", "Venenoso"),
				new Pokemon(71, "Victreebel", Description.VICTREEBELL.descricao, "Grama", "Venenoso"),
				new Pokemon(72, "Tentacool", Description.TENTACOOL.descricao, "Água", "Venenoso"),
				new Pokemon(73, "Tentacruel", Description.TENTACRUEL.descricao, "Água", "Venenoso"),
				new Pokemon(74, "Geodude", Description.GEODUDE.descricao, "Pedra", "Terra"),
				new Pokemon(75, "Graveler", Description.GRAVELER.descricao, "Pedra", "Terra"),
				new Pokemon(76, "Golem", Description.GOLEM.descricao, "Pedra", "Terra"),
				new Pokemon(77, "Ponyta", Description.PONYTA.descricao, "Fogo", null),
				new Pokemon(78, "Rapidash", Description.RAPIDASH.descricao, "Fogo", null),
				new Pokemon(79, "Slowpoke", Description.SLOWPOKE.descricao, "Água", "Psíquico"),
				new Pokemon(80, "Slowbro", Description.SLOWBRO.descricao, "Água", "Psíquico"),
				new Pokemon(81, "Magnemite", Description.MAGNEMITE.descricao, "Elétrico", "Metal"),
				new Pokemon(82, "Magneton", Description.MAGNETON.descricao, "Elétrico", "Metal"),
				new Pokemon(83, "Farfetch'd", Description.FARFETCHD.descricao, "Normal", "Voador"),
				new Pokemon(84, "Doduo", Description.DODUO.descricao, "Normal", "Voador"),
				new Pokemon(85, "Dodrio", Description.DODRIO.descricao, "Normal", "Voador"),
				new Pokemon(86, "Seel", Description.SEEL.descricao, "Água", null),
				new Pokemon(87, "Dewgong", Description.DEWGONG.descricao, "Água", "Gelo"),
				new Pokemon(88, "Grimer", Description.GRIMER.descricao, "Venenoso", null),
				new Pokemon(89, "Muk", Description.MUK.descricao, "Venenoso", null),
				new Pokemon(90, "Shellder", Description.SHELLDER.descricao, "Água", null),
				new Pokemon(91, "Cloyster", Description.CLOYSTER.descricao, "Água", "Gelo"),
				new Pokemon(92, "Gastly", Description.GASTLY.descricao, "Fantasma", "Venenoso"),
				new Pokemon(93, "Haunter", Description.HAUNTER.descricao, "Fantasma", "Venenoso"),
				new Pokemon(94, "Gengar", Description.GENGAR.descricao, "Fantasma", "Venenoso"),
				new Pokemon(95, "Onix", Description.ONIX.descricao, "Pedra", "Terra"),
				new Pokemon(96, "Drowzee", Description.DROWZEE.descricao, "Psíquico", null),
				new Pokemon(97, "Hypno", Description.HYPNO.descricao, "Psíquico", null),
				new Pokemon(98, "Krabby", Description.KRABBY.descricao, "Água", null),
				new Pokemon(99, "Kingler", Description.KINGLER.descricao, "Água", null),
				new Pokemon(100, "Voltorb", Description.VOLTORB.descricao, "Elétrico", null),
				new Pokemon(101, "Electrode", Description.ELECTRODE.descricao, "Elétrico", null),
				new Pokemon(102, "Exeggcute", Description.EXEGGCUTE.descricao, "Grama", "Psíquico"),
				new Pokemon(103, "Exeggutor", Description.EXEGGUTOR.descricao, "Grama", "Psíquico"),
				new Pokemon(104, "Cubone", Description.CUBONE.descricao, "Terra", null),
				new Pokemon(105, "Marowak", Description.MAROWAK.descricao, "Terra", null),
				new Pokemon(106, "Hitmonlee", Description.HITMONLEE.descricao, "Lutador", null),
				new Pokemon(107, "Hitmonchan", Description.HITMONCHAN.descricao, "Lutador", null),
				new Pokemon(108, "Lickitung", Description.LICKITUNG.descricao, "Normal", null),
				new Pokemon(109, "Koffing", Description.KOFFING.descricao, "Venenoso", null),
				new Pokemon(110, "Weezing", Description.WEEZING.descricao, "Venenoso", null),
				new Pokemon(111, "Rhyhorn", Description.RHYHORN.descricao, "Terra", "Pedra"),
				new Pokemon(112, "Rhydon", Description.RHYDON.descricao, "Terra", "Pedra"),
				new Pokemon(113, "Chansey", Description.CHANSEY.descricao, "Normal", null),
				new Pokemon(114, "Tangela", Description.TANGELA.descricao, "Grama", null),
				new Pokemon(115, "Kangaskhan", Description.KANGASKHAN.descricao, "Normal", null),
				new Pokemon(116, "Horsea", Description.HORSEA.descricao, "Água", null),
				new Pokemon(117, "Seadra", Description.SEADRA.descricao, "Água", null),
				new Pokemon(118, "Goldeen", Description.GOLDEEN.descricao, "Água", null),
				new Pokemon(119, "Seaking", Description.SEAKING.descricao, "Água", null),
				new Pokemon(120, "Staryu", Description.STARYU.descricao, "Água", null),
				new Pokemon(121, "Starmie", Description.STARMIE.descricao, "Água", "Psíquico"),
				new Pokemon(122, "Mr. Mime", Description.MRMIME.descricao, "Psíquico", "Fada"),
				new Pokemon(123, "Scyther", Description.SCYTHER.descricao, "Inseto", "Voador"),
				new Pokemon(124, "Jynx", Description.JYNX.descricao, "Gelo", "Psíquico"),
				new Pokemon(125, "Electabuzz", Description.ELECTABUZZ.descricao, "Elétrico", null),
				new Pokemon(126, "Magmar", Description.MAGMAR.descricao, "Fogo", null),
				new Pokemon(127, "Pinsir", Description.PINSIR.descricao, "Inseto", null),
				new Pokemon(128, "Tauros", Description.TAUROS.descricao, "Normal", null),
				new Pokemon(129, "Magikarp", Description.MAGIKARP.descricao, "Água", null),
				new Pokemon(130, "Gyarados", Description.GYARADOS.descricao, "Água", "Voador"),
				new Pokemon(131, "Lapras", Description.LAPRAS.descricao, "Água", "Gelo"),
				new Pokemon(132, "Ditto", Description.DITTO.descricao, "Normal", null),
				new Pokemon(133, "Eevee", Description.EEVEE.descricao, "Normal", null),
				new Pokemon(134, "Vaporeon", Description.VAPOREON.descricao, "Água", null),
				new Pokemon(135, "Jolteon", Description.JOLTEON.descricao, "Elétrico", null),
				new Pokemon(136, "Flareon", Description.FLAREON.descricao, "Fogo", null),
				new Pokemon(137, "Porygon", Description.PORYGON.descricao, "Normal", null),
				new Pokemon(138, "Omanyte", Description.OMANYTE.descricao, "Pedra", "Água"),
				new Pokemon(139, "Omastar", Description.OMASTAR.descricao, "Pedra", "Água"),
				new Pokemon(140, "Kabuto", Description.KABUTO.descricao, "Pedra", "Água"),
				new Pokemon(141, "Kabutops", Description.KABUTOPS.descricao, "Pedra", "Água"),
				new Pokemon(142, "Aerodactyl", Description.AERODACTYL.descricao, "Pedra", "Voador"),
				new Pokemon(143, "Snorlax", Description.SNORLAX.descricao, "Normal", null),
				new Pokemon(144, "Articuno", Description.ARTICUNO.descricao, "Gelo", "Voador"),
				new Pokemon(145, "Zapdos", Description.ZAPDOS.descricao, "Elétrico", "Voador"),
				new Pokemon(146, "Moltres", Description.MOLTRES.descricao, "Fogo", "Voador"),
				new Pokemon(147, "Dratini", Description.DRATINI.descricao, "Dragão", null),
				new Pokemon(148, "Dragonair", Description.DRAGONAIR.descricao, "Dragão", null),
				new Pokemon(149, "Dragonite", Description.DRAGONITE.descricao, "Dragão", null),
				new Pokemon(150, "Mewtwo", Description.MEWTWO.descricao, "Psíquico", null),
				new Pokemon(151, "Mew", Description.MEW.descricao, "Psíquico", null),

				//Lista de Pokémon da segunda geração

				new Pokemon(152, "Chikorita", Description.CHIKORITA.descricao, "Grama", null),
				new Pokemon(153, "Bayleef", Description.BAYLEEF.descricao, "Grama", null),
				new Pokemon(154, "Meganium", Description.MEGANIUM.descricao, "Grama", null),
				new Pokemon(155, "Cyndaquil", Description.CYNDAQUIL.descricao, "Fogo", null),
				new Pokemon(156, "Quilava", Description.QUILAVA.descricao, "Fogo", null),
				new Pokemon(157, "Typhlosion", Description.TYPHLOSION.descricao, "Fogo", null),
				new Pokemon(158, "Totodile", Description.TOTODILE.descricao, "Água", null),
				new Pokemon(159, "Croconaw", Description.CROCONAW.descricao, "Água", null),
				new Pokemon(160, "Feraligatr", Description.FERALIGATR.descricao, "Água", null),
				new Pokemon(161, "Sentret", Description.SENTRET.descricao, "Normal", null),
				new Pokemon(162, "Furret", Description.FURRET.descricao, "Normal", null),
				new Pokemon(163, "Hoothoot", Description.HOOTHOOT.descricao, "Normal", "Voador"),
				new Pokemon(164, "Noctowl", Description.NOCTOWL.descricao, "Normal", "Voador"),
				new Pokemon(165, "Ledyba", Description.LEDYBA.descricao, "Inseto", "Voador"),
				new Pokemon(166, "Ledian", Description.LEDIAN.descricao, "Inseto", "Voador"),
				new Pokemon(167, "Spinarak", Description.SPINARAK.descricao, "Inseto", "Venenoso"),
				new Pokemon(168, "Ariados", Description.ARIADOS.descricao, "Inseto", "Venenoso"),
				new Pokemon(169, "Crobat", Description.CROBAT.descricao, "Venenoso", "Voador"),
				new Pokemon(170, "Chinchou", Description.CHINCHOU.descricao, "Água", "Elétrico"),
				new Pokemon(171, "Lanturn", Description.LANTURN.descricao, "Água", "Elétrico"),
				new Pokemon(172, "Pichu", Description.PICHU.descricao, "Elétrico", null),
				new Pokemon(173, "Cleffa", Description.CLEFFA.descricao, "Fada", null),
				new Pokemon(174, "Igglybuff", Description.IGGLYBUFF.descricao, "Normal", "Fada"),
				new Pokemon(175, "Togepi", Description.TOGEPI.descricao, "Fada", null),
				new Pokemon(176, "Togetic", Description.TOGETIC.descricao, "Fada", "Voador"),
				new Pokemon(177, "Natu", Description.NATU.descricao, "Psíquico", "Voador"),
				new Pokemon(178, "Xatu", Description.XATU.descricao, "Psíquico", "Voador"),
				new Pokemon(179, "Mareep", Description.MAREEP.descricao, "Elétrico", null),
				new Pokemon(180, "Flaaffy", Description.FLAAFFY.descricao, "Elétrico", null),
				new Pokemon(181, "Ampharos", Description.AMPHAROS.descricao, "Elétrico", null),
				new Pokemon(182, "Bellossom", Description.BELLOSSOM.descricao, "Grama", null),
				new Pokemon(183, "Marill", Description.MARILL.descricao, "Água", "Fada"),
				new Pokemon(184, "Azumarill", Description.AZUMARILL.descricao, "Água", "Fada"),
				new Pokemon(185, "Sudowoodo", Description.SUDOWOODO.descricao, "Pedra", null),
				new Pokemon(186, "Politoed", Description.POLITOED.descricao, "Água", null),
				new Pokemon(187, "Hoppip", Description.HOPPIP.descricao, "Grama", "Voador"),
				new Pokemon(188, "Skiploom", Description.SKIPLOOM.descricao, "Grama", "Voador"),
				new Pokemon(189, "Jumpluff", Description.JUMPLUFF.descricao, "Grama", "Voador"),
				new Pokemon(190, "Aipom", Description.AIPOM.descricao, "Normal", null),
				new Pokemon(191, "Sunkern", Description.SUNKERN.descricao, "Grama", null),
				new Pokemon(192, "Sunflora", Description.SUNFLORA.descricao, "Grama", null),
				new Pokemon(193, "Yanma", Description.YANMA.descricao, "Inseto", "Voador"),
				new Pokemon(194, "Wooper", Description.WOOPER.descricao, "Água", "Terra"),
				new Pokemon(195, "Quagsire", Description.QUAGSIRE.descricao, "Água", "Terra"),
				new Pokemon(196, "Espeon", Description.ESPEON.descricao, "Psíquico", null),
				new Pokemon(197, "Umbreon", Description.UMBREON.descricao, "Sombra", null),
				new Pokemon(198, "Murkrow", Description.MURKROW.descricao, "Sombra", "Voador"),
				new Pokemon(199, "Slowking", Description.SLOWKING.descricao, "Água", "Psíquico"),
				new Pokemon(200, "Misdreavus", Description.MISDREAVUS.descricao, "Fantasma", null),
				new Pokemon(201, "Unown", Description.UNOWN.descricao, "Psíquico", null),
				new Pokemon(202, "Wobbuffet", Description.WOBBUFFET.descricao, "Psíquico", null),
				new Pokemon(203, "Girafarig", Description.GIRAFARIG.descricao, "Normal", "Psíquico"),
				new Pokemon(204, "Pineco", Description.PINECO.descricao, "Inseto", null),
				new Pokemon(205, "Forretress", Description.FORRETRESS.descricao, "Inseto", "Metal"),
				new Pokemon(206, "Dunsparce", Description.DUNSPARCE.descricao, "Normal", null),
				new Pokemon(207, "Gligar", Description.GLIGAR.descricao, "Terra", "Voador"),
				new Pokemon(208, "Steelix", Description.STEELIX.descricao, "Metal", "Terra"),
				new Pokemon(209, "Snubbull", Description.SNUBBULL.descricao, "Fada", null),
				new Pokemon(210, "Granbull", Description.GRANBULL.descricao, "Fada", null),
				new Pokemon(211, "Qwilfish", Description.QWILFISH.descricao, "Água", "Venenoso"),
				new Pokemon(212, "Scizor", Description.SCIZOR.descricao, "Inseto", "Metal"),
				new Pokemon(213, "Shuckle", Description.SHUCKLE.descricao, "Inseto", "Pedra"),
				new Pokemon(214, "Heracross", Description.HERACROSS.descricao, "Inseto", "Lutador"),
				new Pokemon(215, "Sneasel", Description.SNEASEL.descricao, "Sombra", "Gelo"),
				new Pokemon(216, "Teddiursa", Description.TEDDIURSA.descricao, "Normal", null),
				new Pokemon(217, "Ursaring", Description.URSARING.descricao, "Normal", null),
				new Pokemon(218, "Slugma", Description.SLUGMA.descricao, "Fogo", null),
				new Pokemon(219, "Magcargo", Description.MAGCARGO.descricao, "Fogo", "Pedra"),
				new Pokemon(220, "Swinub", Description.SWINUB.descricao, "Gelo", "Terra"),
				new Pokemon(221, "Piloswine", Description.PILOSWINE.descricao, "Gelo", "Terra"),
				new Pokemon(222, "Corsola", Description.CORSOLA.descricao, "Água", "Pedra"),
				new Pokemon(223, "Remoraid", Description.REMORAID.descricao, "Água", null),
				new Pokemon(224, "Octillery", Description.OCTILLERY.descricao, "Água", null),
				new Pokemon(225, "Delibird", Description.DELIBIRD.descricao, "Gelo", "Voador"),
				new Pokemon(226, "Mantine", Description.MANTINE.descricao, "Água", "Voador"),
				new Pokemon(227, "Skarmory", Description.SKARMORY.descricao, "Metal", "Voador"),
				new Pokemon(228, "Houndour", Description.HOUNDOUR.descricao, "Sombra", "Fogo"),
				new Pokemon(229, "Houndoom", Description.HOUNDOOM.descricao, "Sombra", "Fogo"),
				new Pokemon(230, "Kingdra", Description.KINGDRA.descricao, "Água", "Dragão"),
				new Pokemon(231, "Phanpy", Description.PHANPY.descricao, "Terra", null),
				new Pokemon(232, "Donphan", Description.DONPHAN.descricao, "Terra", null),
				new Pokemon(233, "Porygon2", Description.PORYGON2.descricao, "Normal", null),
				new Pokemon(234, "Stantler", Description.STANTLER.descricao, "Normal", null),
				new Pokemon(235, "Smeargle", Description.SMEARGLE.descricao, "Normal", null),
				new Pokemon(236, "Tyrogue", Description.TYROGUE.descricao, "Lutador", null),
				new Pokemon(237, "Hitmontop", Description.HITMONTOP.descricao, "Lutador", null),
				new Pokemon(238, "Smoochum", Description.SMOOCHUM.descricao, "Gelo", "Psíquico"),
				new Pokemon(239, "Elekid", Description.ELEKID.descricao, "Elétrico", null),
				new Pokemon(240, "Magby", Description.MAGBY.descricao, "Fogo", null),
				new Pokemon(241, "Miltank", Description.MILTANK.descricao, "Normal", null),
				new Pokemon(242, "Blissey", Description.BLISSEY.descricao, "Normal", null),
				new Pokemon(243, "Raikou", Description.RAIKOU.descricao, "Elétrico", null),
				new Pokemon(244, "Entei", Description.ENTEI.descricao, "Fogo", null),
				new Pokemon(245, "Suicune", Description.SUICUNE.descricao, "Água", null),
				new Pokemon(246, "Larvitar", Description.LARVITAR.descricao, "Pedra", "Terra"),
				new Pokemon(247, "Pupitar", Description.PUPITAR.descricao, "Pedra", "Terra"),
				new Pokemon(248, "Tyranitar", Description.TYRANITAR.descricao, "Pedra", "Sombra"),
				new Pokemon(249, "Lugia", Description.LUGIA.descricao, "Psíquico", "Voador"),
				new Pokemon(250, "Ho-Oh", Description.HOOH.descricao, "Fogo", "Voador"),
				new Pokemon(251, "Celebi", Description.CELEBI.descricao, "Psíquico", "Grama")));

		return lista;
	}
}