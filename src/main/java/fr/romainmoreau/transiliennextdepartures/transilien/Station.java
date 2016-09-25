package fr.romainmoreau.transiliennextdepartures.transilien;

import java.util.Arrays;

public enum Station {
	ABLON("87545269", "Ablon"), //
	ACHÈRES_GRAND_CORMIER("87386052", "Achères Grand Cormier"), //
	ACHÈRES_VILLE("87381657", "Achères Ville"), //
	AÉROPORT_CH_DE_GAULLE_1("87271460", "Aéroport Ch. de Gaulle 1"), //
	AÉROPORT_CH_DE_GAULLE_2_TGV("87001479", "Aéroport Ch. de Gaulle 2 TGV"), //
	ANDRÉSY("87381491", "Andrésy"), //
	ANGERVILLE("87543090", "Angerville"), //
	ARGENTEUIL("87381848", "Argenteuil"), //
	ARPAJON("87545467", "Arpajon"), //
	ASNIÈRES_SUR_SEINE("87381137", "Asnières sur Seine"), //
	ATHIS_MONS("87545251", "Athis Mons"), //
	AUBERGENVILLE_ELISABETHVILLE("87386730", "Aubergenville Elisabethville"), //
	AULNAY_SOUS_BOIS("87271411", "Aulnay sous Bois"), //
	AUVERS_SUR_OISE("87276543", "Auvers sur Oise"), //
	AVENUE_DU_PDT_KENNEDY("87543207", "Avenue du Pdt Kennedy"), //
	AVENUE_FOCH("87381038", "Avenue Foch"), //
	AVENUE_HENRI_MARTIN("87381046", "Avenue Henri Martin"), //
	BAGNEAUX_SUR_LOING("87684191", "Bagneaux sur Loing"), //
	BALLANCOURT("87681437", "Ballancourt"), //
	BÉCON_LES_BRUYÈRES("87382002", "Bécon les Bruyères"), //
	BELLEVUE("87393116", "Bellevue"), //
	BELLOY_SAINT_MARTIN("87276550", "Belloy Saint-Martin"), //
	BESSANCOURT("87276642", "Bessancourt"), //
	BEYNES("87393363", "Beynes"), //
	BIBLIOTHÈQUE_FRANÇOIS_MITTERRAND("87328328", "Bibliothèque François Mitterrand"), //
	BIÈVRES("87393546", "Bièvres"), //
	BOIGNEVILLE("87684407", "Boigneville"), //
	BOIS_COLOMBES("87381079", "Bois Colombes"), //
	BOIS_LE_ROI("87682203", "Bois le Roi"), //
	BOISSISE_LE_ROI("87682518", "Boissise le Roi"), //
	BOISSY_L_AILLERIE("87381152", "Boissy l'aillerie"), //
	BONDY("87113407", "Bondy"), //
	BONNIÈRES("87415893", "Bonnières"), //
	BORAN_SUR_OISE("87276444", "Boran sur Oise"), //
	BOUFFÉMONT_MOISSELLES("87276485", "Bouffémont Moisselles"), //
	BOUGIVAL("87382440", "Bougival"), //
	BOULAINVILLIERS("87543181", "Boulainvilliers"), //
	BOURAY("87545178", "Bouray"), //
	BOURRON_MARLOTTE_GREZ("87684118", "Bourron Marlotte Grez"), //
	BOUSSY_SAINT_ANTOINE("87682138", "Boussy Saint-Antoine"), //
	BOUTIGNY("87681478", "Boutigny"), //
	BRÉTIGNY("87545194", "Brétigny"), //
	BREUILLET_BRUYÈRES_LE_CHÂTEL("87545483", "Breuillet Bruyères le Châtel"), //
	BREUILLET_VILLAGE("87545491", "Breuillet Village"), //
	BREVAL("87381624", "Breval"), //
	BRUNOY("87682120", "Brunoy"), //
	BRUYÈRES_SUR_OISE("87276451", "Bruyères sur Oise"), //
	BUNO_GIRONVILLE("87681510", "Buno Gironville"), //
	CERGY_LE_HAUT("87382655", "Cergy le Haut"), //
	CERGY_PRÉFECTURE("87381905", "Cergy Préfecture"), //
	CERGY_SAINT_CHRISTOPHE("87382499", "Cergy Saint-Christophe"), //
	CERNAY("87276063", "Cernay"), //
	CESSON("87682161", "Cesson"), //
	CHAMARANDE("87545152", "Chamarande"), //
	CHAMPAGNE_SUR_OISE("87276519", "Champagne sur Oise"), //
	CHAMPAGNE_SUR_SEINE("87682450", "Champagne sur Seine"), //
	CHAMPBENOIST_POIGNY("87115873", "Champbenoist Poigny"), //
	CHAMP_DE_COURSES_D_ENGHIEN("87276030", "Champ de Courses d'Enghien"), //
	CHAMP_DE_MARS_TOUR_EIFFEL("87393058", "Champ de Mars Tour Eiffel"), //
	CHANGIS_SAINT_JEAN("87116509", "Changis Saint-Jean"), //
	CHANTELOUP_LES_VIGNES("87381475", "Chanteloup les Vignes"), //
	CHANTILLY_GOUVIEUX("87276113", "Chantilly Gouvieux"), //
	CHAPONVAL("87276162", "Chaponval"), //
	CHARS("87381194", "Chars"), //
	CHARTRETTES("87682419", "Chartrettes"), //
	CHÂTEAU_THIERRY("87116582", "Château Thierry"), //
	CHÂTELET_LES_HALLES("87758607", "Châtelet les Halles"), //
	CHAUMONT_EN_VEXIN("87381228", "Chaumont en Vexin"), //
	CHAVILLE_RIVE_DROITE("87382333", "Chaville Rive Droite"), //
	CHAVILLE_RIVE_GAUCHE("87393207", "Chaville Rive Gauche"), //
	CHAVILLE_VÉLIZY("87393173", "Chaville Vélizy"), //
	CHELLES_GOURNAY("87116111", "Chelles Gournay"), //
	CHEMIN_D_ANTONY("87546317", "Chemin d'Antony"), //
	CHÉZY_SUR_MARNE("87116574", "Chézy sur Marne"), //
	CHILLY_MAZARIN("87393637", "Chilly Mazarin"), //
	CHOISY_LE_ROI("87545285", "Choisy le Roi"), //
	CLAMART("87391565", "Clamart"), //
	CLICHY_LEVALLOIS("87381129", "Clichy Levallois"), //
	COIGNIÈRES("87393272", "Coignières"), //
	COLOMBES("87381087", "Colombes"), //
	COMBS_LA_VILLE_QUINCY("87682146", "Combs la Ville Quincy"), //
	COMPANS("87272047", "Compans"), //
	CONFLANS_FIN_D_OISE("87381459", "Conflans Fin d'Oise"), //
	CONFLANS_SAINTE_HONORINE("87381897", "Conflans Sainte-Honorine"), //
	CORBEIL_ESSONNES("87681007", "Corbeil Essonnes"), //
	CORMEILLES_EN_PARISIS("87381863", "Cormeilles en Parisis"), //
	COUILLY_SAINT_GERMAIN("87116731", "Couilly Saint-Germain"), //
	COULOMMIERS("87116301", "Coulommiers"), //
	COURBEVOIE("87382200", "Courbevoie"), //
	CRÉCY_LA_CHAPELLE("87116772", "Crécy la Chapelle"), //
	CREIL("87276006", "Creil"), //
	CRÉPY_EN_VALOIS("87271593", "Crépy en Valois"), //
	CROUY_SUR_OURCQ("87116640", "Crouy sur Ourcq"), //
	DAMMARTIN_JUILLY_SAINT_MARD("87271536", "Dammartin Juilly Saint-Mard"), //
	DEUIL_MONTMAGNY("87276345", "Deuil Montmagny"), //
	DOMONT("87276436", "Domont"), //
	DORDIVES("87684233", "Dordives"), //
	DOURDAN("87545525", "Dourdan"), //
	DOURDAN_LA_FORÊT("87540179", "Dourdan la Forêt"), //
	DRANCY("87271403", "Drancy"), //
	DREUX("87393488", "Dreux"), //
	ECOUEN_EZANVILLE("87276394", "Ecouen Ezanville"), //
	EGLY("87545475", "Egly"), //
	EMERAINVILLE_PONTAULT_COMBAULT("87116046", "Emerainville Pontault Combault"), //
	ENGHIEN_LES_BAINS("87276022", "Enghien les Bains"), //
	EPINAY_SUR_ORGE("87545228", "Epinay sur Orge"), //
	EPINAY_SUR_SEINE("87271148", "Epinay sur Seine"), //
	EPINAY_VILLETANEUSE("87271122", "Epinay Villetaneuse"), //
	EPLUCHES("87276147", "Epluches"), //
	EPÔNE_MÉZIÈRES("87386763", "Epône Mézières"), //
	ERAGNY_NEUVILLE("87381418", "Eragny Neuville"), //
	ERMONT_EAUBONNE_1("87276055", "Ermont Eaubonne"), //
	ERMONT_EAUBONNE_2("87534131", "Ermont Eaubonne"), //
	ERMONT_HALTE("87276584", "Ermont Halte"), //
	ESBLY("87116327", "Esbly"), //
	ESSONNES_ROBINSON("87681601", "Essonnes Robinson"), //
	ETAMPES("87545137", "Etampes"), //
	ETRÉCHY("87545145", "Etréchy"), //
	EVRY_COURCOURONNES_CENTRE("87681387", "Evry Courcouronnes Centre"), //
	EVRY_VAL_DE_SEINE("87681361", "Evry Val de Seine"), //
	FAREMOUTIERS_POMMEUSE("87116277", "Faremoutiers Pommeuse"), //
	FERRIÈRES_FONTENAY("87684241", "Ferrières Fontenay"), //
	FONTAINEBLEAU_AVON("87682211", "Fontainebleau Avon"), //
	FONTAINE_LE_PORT("87682427", "Fontaine le Port"), //
	FONTENAY_LE_FLEURY("87393405", "Fontenay le Fleury"), //
	FRANCONVILLE_LE_PLESSIS_BOUCHARD("87276071", "Franconville Le Plessis Bouchard"), //
	FRÉPILLON("87276659", "Frépillon"), //
	GAGNY("87113514", "Gagny"), //
	GARANCIÈRES_LA_QUEUE("87393439", "Garancières La Queue"), //
	GARCHES_MARNES_LA_COQUETTE("87382259", "Garches Marnes la Coquette"), //
	GARGENVILLE("87381566", "Gargenville"), //
	GARGES_SARCELLES("87276196", "Garges Sarcelles"), //
	GAZERAN("87393348", "Gazeran"), //
	GENNEVILLIERS("87271205", "Gennevilliers"), //
	GISORS("87381244", "Gisors"), //
	GOUSSAINVILLE("87276246", "Goussainville"), //
	GRAND_BOURG("87681353", "Grand Bourg"), //
	GRAVIGNY_BALIZY("87393645", "Gravigny Balizy"), //
	GRETZ_ARMAINVILLIERS("87116012", "Gretz Armainvilliers"), //
	GRIGNY_CENTRE("87681379", "Grigny Centre"), //
	GROSLAY("87276360", "Groslay"), //
	GROS_NOYER_SAINT_PRIX("87276592", "Gros Noyer Saint-Prix"), //
	GUÉRARD_LA_CELLE_SUR_MORIN("87116269", "Guérard la Celle sur Morin"), //
	GUILLERVAL("87545129", "Guillerval"), //
	HAUSSMANN_SAINT_LAZARE("87281899", "Haussmann Saint-Lazare"), //
	HERBLAY("87381889", "Herblay"), //
	HÉRICY("87682435", "Héricy"), //
	HOUDAN("87393462", "Houdan"), //
	HOUILLES_CARRIÈRES_SUR_SEINE("87386409", "Houilles Carrières sur Seine"), //
	IGNY("87393561", "Igny"), //
	INVALIDES("87393033", "Invalides"), //
	ISLES_ARMENTIÈRES_CONGIS("87116616", "Isles Armentières Congis"), //
	ISSOU_PORCHEVILLE("87381574", "Issou Porcheville"), //
	ISSY("87393074", "Issy"), //
	ISSY_VAL_DE_SEINE("87393306", "Issy Val de Seine"), //
	IVRY_SUR_SEINE("87545301", "Ivry sur Seine"), //
	JAVEL("87393066", "Javel"), //
	JOUY_EN_JOSAS("87393512", "Jouy en Josas"), //
	JUVISY("87545244", "Juvisy"), //
	JUZIERS("87381558", "Juziers"), //
	LA_BARRE_ORMESSON("87271171", "La Barre Ormesson"), //
	LA_BORNE_BLANCHE("87276287", "La Borne Blanche"), //
	LA_CELLE_SAINT_CLOUD("87382432", "La Celle Saint-Cloud"), //
	LA_COURNEUVE_AUBERVILLIERS("87271304", "La Courneuve Aubervilliers"), //
	LA_DÉFENSE_GRANDE_ARCHE("87758011", "La Défense Grande Arche"), //
	LA_FERTÉ_ALAIS("87681452", "La Ferté Alais"), //
	LA_FERTÉ_MILON("87116673", "La Ferté Milon"), //
	LA_FERTÉ_SOUS_JOUARRE("87116517", "La Ferté sous Jouarre"), //
	LA_FRETTE_MONTIGNY("87381871", "La Frette Montigny"), //
	LA_GARENNE_COLOMBES("87386003", "La Garenne Colombes"), //
	LAGNY_THORIGNY("87116319", "Lagny Thorigny"), //
	LA_GRANDE_PAROISSE("87682476", "La Grande Paroisse"), //
	LA_NORVILLE_SAINT_GERMAIN_LÈS_A_("87545459", "La Norville Saint-Germain lès A."), //
	LA_PLAINE_STADE_DE_FRANCE("87164798", "La Plaine Stade de France"), //
	LARDY("87545160", "Lardy"), //
	LA_VERRIÈRE("87393256", "La Verrière"), //
	LA_VILLETERTRE("87381202", "La Villetertre"), //
	LE_BLANC_MESNIL("87271478", "Le Blanc Mesnil"), //
	LE_BOURGET("87271395", "Le Bourget"), //
	LE_BRAS_DE_FER_EVRY_GÉNOPOLE("87681395", "Le Bras de Fer Evry Génopole"), //
	LE_CHÉNAY_GAGNY("87113522", "Le Chénay Gagny"), //
	LE_COUDRAY_MONTCEAU("87681635", "Le Coudray Montceau"), //
	LE_MÉE("87682179", "Le Mée"), //
	LE_PERRAY("87393298", "Le Perray"), //
	LE_PLESSIS_BELLEVILLE("87271551", "Le Plessis Belleville"), //
	LE_PLESSIS_CHENET("87681627", "Le Plessis Chenet"), //
	LE_RAINCY_VILLEMOMBLE_MONTFERMEIL("87113472", "Le Raincy Villemomble Montfermeil"), //
	LES_ARDOINES("87492108", "Les Ardoines"), //
	LES_BOULLEREAUX_CHAMPIGNY("87113779", "Les Boullereaux Champigny"), //
	LES_CLAIRIÈRES_DE_VERNEUIL("87386664", "Les Clairières de Verneuil"), //
	LES_ESSARTS_LE_ROI("87393280", "Les Essarts le Roi"), //
	LES_GRÉSILLONS("87272146", "Les Grésillons"), //
	LES_MUREAUX("87386680", "Les Mureaux"), //
	LES_NOUES("87276238", "Les Noues"), //
	LES_SAULES("87546226", "Les Saules"), //
	LE_STADE("87381095", "Le Stade"), //
	LES_VALLÉES("87386300", "Les Vallées"), //
	LES_YVRIS_NOISY_LE_GRAND("87113803", "Les Yvris Noisy le Grand"), //
	L_ETANG_LA_VILLE("87382473", "L'Etang la Ville"), //
	LE_VAL_D_OR("87382366", "Le Val d'Or"), //
	LE_VERT_DE_MAISONS("87681247", "Le Vert de Maisons"), //
	LIANCOURT_SAINT_PIERRE("87381210", "Liancourt Saint-Pierre"), //
	LIEUSAINT_MOISSY("87682153", "Lieusaint Moissy"), //
	LIMAY("87381582", "Limay"), //
	L_ISLE_ADAM_PARMAIN("87276527", "L'Isle Adam Parmain"), //
	LIVRY_SUR_SEINE("87682401", "Livry sur Seine"), //
	LIZY_SUR_OURCQ("87116632", "Lizy sur Ourcq"), //
	LONGJUMEAU("87393611", "Longjumeau"), //
	LONGUEVILLE("87116137", "Longueville"), //
	LOUVECIENNES("87382457", "Louveciennes"), //
	LOUVRES("87276253", "Louvres"), //
	LUZARCHES("87276576", "Luzarches"), //
	MAGENTA("87281873", "Magenta"), //
	MAISONS_ALFORT_ALFORTVILLE("87681155", "Maisons Alfort Alfortville"), //
	MAISONS_LAFFITTE("87386425", "Maisons Laffitte"), //
	MAISSE("87681486", "Maisse"), //
	MALESHERBES("87684415", "Malesherbes"), //
	MANTES_LA_JOLIE("87381509", "Mantes la Jolie"), //
	MANTES_STATION("87381590", "Mantes Station"), //
	MARCHEZAIS_BROUÉ("87393470", "Marchezais Broué"), //
	MAREIL_MARLY("87382812", "Mareil Marly"), //
	MAREIL_SUR_MAULDRE("87381715", "Mareil sur Mauldre"), //
	MAREUIL_SUR_OURCQ("87116665", "Mareuil sur Ourcq"), //
	MARLES_EN_BRIE("87116228", "Marles en Brie"), //
	MARLY_LE_ROI("87382465", "Marly le Roi"), //
	MAROLLES_EN_HUREPOIX("87545186", "Marolles en Hurepoix"), //
	MASSY_PALAISEAU("87393579", "Massy Palaiseau"), //
	MASSY_VERRIÈRES("87383281", "Massy Verrières"), //
	MAULE("87381723", "Maule"), //
	MAURECOURT("87381483", "Maurecourt"), //
	MEAUX("87116103", "Meaux"), //
	MELUN("87682005", "Melun"), //
	MENERVILLE("87381616", "Menerville"), //
	MENNECY("87681411", "Mennecy"), //
	MÉRIEL("87276675", "Mériel"), //
	MÉRY_SUR_OISE("87276667", "Méry sur Oise"), //
	MEUDON("87393108", "Meudon"), //
	MEUDON_VAL_FLEURY("87393082", "Meudon Val Fleury"), //
	MEULAN_HARDRICOURT("87381830", "Meulan Hardricourt"), //
	MITRY_CLAYE("87271528", "Mitry Claye"), //
	MONNERVILLE("87545111", "Monnerville"), //
	MONTARGIS("87684001", "Montargis"), //
	MONTEREAU("87682302", "Montereau"), //
	MONTFORT_L_AMAURY_MÉRÉ("87393892", "Montfort l'Amaury Méré"), //
	MONTGERON_CROSNE("87682104", "Montgeron Crosne"), //
	MONTGEROULT_COURCELLES("87381160", "Montgeroult Courcelles"), //
	MONTIGNY_BEAUCHAMP("87276089", "Montigny Beauchamp"), //
	MONTIGNY_SUR_LOING("87684100", "Montigny sur Loing"), //
	MONTREUIL("87382879", "Montreuil"), //
	MONTRY_CONDÉ("87116400", "Montry Condé"), //
	MONTSOULT_MAFFLIERS("87276493", "Montsoult Maffliers"), //
	MORET_VENEUX_LES_SABLONS("87682278", "Moret Veneux les Sablons"), //
	MORMANT("87116087", "Mormant"), //
	MORTCERF("87116244", "Mortcerf"), //
	MOULIN_GALANT("87681403", "Moulin Galant"), //
	MOUROUX("87116285", "Mouroux"), //
	MUSÉE_D_ORSAY("87547307", "Musée d'Orsay"), //
	NANGIS("87116095", "Nangis"), //
	NANTERRE_UNIVERSITÉ("87386318", "Nanterre Université"), //
	NANTEUIL_LE_HAUDOUIN("87271577", "Nanteuil le Haudouin"), //
	NANTEUIL_SAÂCY("87116558", "Nanteuil Saâcy"), //
	NEMOURS_SAINT_PIERRE("87684126", "Nemours Saint-Pierre"), //
	NEUILLY_PORTE_MAILLOT("87381020", "Neuilly Porte Maillot"), //
	NEUVILLE_UNIVERSITÉ("87334482", "Neuville Université"), //
	NEZEL_AULNAY("87381731", "Nezel Aulnay"), //
	NOGENT_L_ARTAUD_CHARLY("87116566", "Nogent l'Artaud Charly"), //
	NOGENT_LE_PERREUX("87113746", "Nogent Le Perreux"), //
	NOINTEL_MOURS("87276758", "Nointel Mours"), //
	NOISY_LE_ROI("87393876", "Noisy le Roi"), //
	NOISY_LE_SEC("87113217", "Noisy le Sec"), //
	ORANGIS_BOIS_DE_L_EPINE("87681346", "Orangis Bois de l'Epine"), //
	ORGERUS_BÉHOUST("87393447", "Orgerus Béhoust"), //
	ORLY_VILLE("87546200", "Orly Ville"), //
	ORMOY_VILLERS("87271585", "Ormoy Villers"), //
	ORRY_LA_VILLE_COYE_LA_FORÊT("87276279", "Orry la Ville Coye la Forêt"), //
	OSNY("87381145", "Osny"), //
	OZOIR_LA_FERRIÈRE("87116020", "Ozoir la Ferrière"), //
	PANTIN("87113209", "Pantin"), //
	PARC_DES_EXPOSITIONS("87271486", "Parc des Expositions"), //
	PARIS_AUSTERLITZ_1("87547026", "Paris Austerlitz"), //
	PARIS_AUSTERLITZ_2("87547000", "Paris Austerlitz"), //
	PARIS_BERCY("87686667", "Paris Bercy"), //
	PARIS_EST("87113001", "Paris Est"), //
	PARIS_GARE_DE_LYON_1("87686006", "Paris Gare de Lyon"), //
	PARIS_GARE_DE_LYON_2("87758581", "Paris Gare de Lyon"), //
	PARIS_MONTPARNASSE("87391003", "Paris Montparnasse"), //
	PARIS_NORD_1("87271007", "Paris Nord"), //
	PARIS_NORD_2("87271031", "Paris Nord"), //
	PARIS_NORD_3("87271023", "Paris Nord"), //
	PARIS_SAINT_LAZARE("87384008", "Paris Saint-Lazare"), //
	PARIS_VAUGIRARD("87391102", "Paris Vaugirard"), //
	PÉREIRE_LEVALLOIS("87381012", "Péreire Levallois"), //
	PERSAN_BEAUMONT("87276469", "Persan Beaumont"), //
	PETIT_JOUY_LES_LOGES("87393504", "Petit Jouy Les Loges"), //
	PETIT_VAUX("87393652", "Petit Vaux"), //
	PIERREFITTE_STAINS("87271163", "Pierrefitte Stains"), //
	PIERRELAYE("87276097", "Pierrelaye"), //
	PLAISIR_GRIGNON("87393421", "Plaisir Grignon"), //
	PLAISIR_LES_CLAYES("87393629", "Plaisir les Clayes"), //
	POISSY("87386573", "Poissy"), //
	PONT_CARDINET("87381111", "Pont Cardinet"), //
	PONT_DE_L_ALMA("87393041", "Pont de l'Alma"), //
	PONT_DE_RUNGIS_AÉROPORT_D_ORLY("87546192", "Pont de Rungis Aéroport d'Orly"), //
	PONT_DU_GARIGLIANO("87393322", "Pont du Garigliano"), //
	PONTHIERRY_PRINGY("87682526", "Ponthierry Pringy"), //
	PONTOISE("87276139", "Pontoise"), //
	PONT_PETIT("87276154", "Pont Petit"), //
	PORCHEFONTAINE("87393165", "Porchefontaine"), //
	PORTE_DE_CLICHY("87111278", "Porte de Clichy"), //
	PORT_VILLEZ("87415679", "Port-Villez"), //
	PRÉCY_SUR_OISE("87276410", "Précy sur Oise"), //
	PRESLES_COURCELLES("87276501", "Presles Courcelles"), //
	PROVINS("87116160", "Provins"), //
	PUTEAUX("87382382", "Puteaux"), //
	RAMBOUILLET("87393314", "Rambouillet"), //
	RIS_ORANGIS("87681338", "Ris Orangis"), //
	ROISSY_EN_BRIE("87116038", "Roissy en Brie"), //
	ROSNY_BOIS_PERRIER("87113696", "Rosny Bois Perrier"), //
	ROSNY_SOUS_BOIS("87113704", "Rosny sous Bois"), //
	ROSNY_SUR_SEINE("87415885", "Rosny sur Seine"), //
	RUNGIS_LA_FRATERNELLE("87546291", "Rungis La Fraternelle"), //
	SAINT_CHÉRON("87545509", "Saint-Chéron"), //
	SAINT_CLOUD("87382358", "Saint-Cloud"), //
	SAINT_CYR("87393223", "Saint-Cyr"), //
	SAINT_DENIS("87271015", "Saint-Denis"), //
	SAINTE_COLOMBE_SEPTVEILLES("87116178", "Sainte-Colombe Septveilles"), //
	SAINTE_GENEVIÈVE_DES_BOIS("87545210", "Sainte-Geneviève des Bois"), //
	SAINT_FARGEAU("87682542", "Saint-Fargeau"), //
	SAINT_GERMAIN_EN_LAYE_BEL_AIR_FOURQUEUX("87366922", "Saint-Germain en Laye Bel Air Fourqueux"), //
	SAINT_GERMAIN_EN_LAYE_GC("87382804", "Saint Germain en Laye GC"), //
	SAINT_GRATIEN("87276170", "Saint-Gratien"), //
	SAINT_LEU_D_ESSERENT("87276402", "Saint-Leu d'Esserent"), //
	SAINT_LEU_LA_FORÊT("87276600", "Saint-Leu la Forêt"), //
	SAINT_MAMMÈS("87682294", "Saint-Mammès"), //
	SAINT_MARTIN_D_ETAMPES("87545350", "Saint-Martin d'Etampes"), //
	SAINT_MICHEL_NOTRE_DAME("87547315", "Saint-Michel Notre Dame"), //
	SAINT_MICHEL_SUR_ORGE("87545202", "Saint-Michel sur Orge"), //
	SAINT_NOM_LA_BRETÈCHE_F_DE_MARLY("87382481", "Saint-Nom la Bretèche F. de Marly"), //
	SAINT_OUEN("87271247", "Saint-Ouen"), //
	SAINT_OUEN_L_AUMÔNE("87276105", "Saint-Ouen l'Aumône"), //
	SAINT_OUEN_L_AUMÔNE_LIESSE("87337980", "Saint-Ouen l'Aumône Liesse"), //
	SAINT_OUEN_L_AUMÔNE_QUARTIER_DE_L_EGLISE("87381426", "Saint-Ouen l'Aumône Quartier de l'Eglise"), //
	SAINT_QUENTIN_EN_Y_MONTIGNY_LE_B_("87393843", "Saint-Quentin en Y. Montigny le B."), //
	SANNOIS("87276188", "Sannois"), //
	SANTEUIL_LE_PERCHAY("87381186", "Santeuil le Perchay"), //
	SARCELLES_SAINT_BRICE("87276386", "Sarcelles Saint-Brice"), //
	SARTROUVILLE("87386417", "Sartrouville"), //
	SAVIGNY_LE_TEMPLE_NANDY("87682187", "Savigny le Temple Nandy"), //
	SAVIGNY_SUR_ORGE("87545236", "Savigny sur Orge"), //
	SERMAISE("87545517", "Sermaise"), //
	SEUGY("87272039", "Seugy"), //
	SEVRAN_BEAUDOTTES("87271445", "Sevran Beaudottes"), //
	SEVRAN_LIVRY("87271429", "Sevran Livry"), //
	SÈVRES_RIVE_GAUCHE("87393124", "Sèvres Rive gauche"), //
	SÈVRES_VILLE_D_AVRAY("87382341", "Sèvres Ville d'Avray"), //
	SOUPPES_CHÂTEAU_LANDON("87684217", "Souppes Château Landon"), //
	STADE_DE_FRANCE_SAINT_DENIS("87164780", "Stade de France Saint-Denis"), //
	SURESNES_MONT_VALÉRIEN("87382374", "Suresnes Mont Valérien"), //
	SURVILLIERS_FOSSES("87276261", "Survilliers Fosses"), //
	TACOIGNIÈRES_RICHEBOURG("87393454", "Tacoignières Richebourg"), //
	TAVERNY("87276634", "Taverny"), //
	THIEUX_NANTOUILLET("87272054", "Thieux Nantouillet"), //
	THOMERY("87682252", "Thomery"), //
	THUN_LE_PARADIS("87381822", "Thun le Paradis"), //
	TOURNAN("87116210", "Tournan"), //
	TRAPPES("87393231", "Trappes"), //
	TRIE_CHÂTEAU("87381236", "Trie Château"), //
	TRIEL_SUR_SEINE("87381806", "Triel sur Seine"), //
	TRILPORT("87116491", "Trilport"), //
	US("87381178", "Us"), //
	VAIRES_TORCY("87116293", "Vaires Torcy"), //
	VAL_D_ARGENTEUIL("87381798", "Val d'Argenteuil"), //
	VAL_DE_FONTENAY("87113712", "Val de Fontenay"), //
	VALMONDOIS("87276535", "Valmondois"), //
	VANVES_MALAKOFF("87391532", "Vanves Malakoff"), //
	VAUBOYEN("87393538", "Vauboyen"), //
	VAUCELLES("87276626", "Vaucelles"), //
	VAUCRESSON("87382267", "Vaucresson"), //
	VAUX_SUR_SEINE("87381814", "Vaux sur Seine"), //
	VERNEUIL_L_ETANG("87116079", "Verneuil l'Etang"), //
	VERNOUILLET_VERNEUIL("87386656", "Vernouillet Verneuil"), //
	VERNOU_SUR_SEINE("87682468", "Vernou sur Seine"), //
	VERSAILLES_CHANTIERS("87393009", "Versailles Chantiers"), //
	VERSAILLES_CHÂTEAU_RIVE_GAUCHE("87393157", "Versailles Château Rive Gauche"), //
	VERSAILLES_RIVE_DROITE("87382861", "Versailles Rive Droite"), //
	VERT_GALANT("87271437", "Vert Galant"), //
	VIARMES("87276568", "Viarmes"), //
	VIGNEUX_SUR_SEINE("87681304", "Vigneux sur Seine"), //
	VILLABÉ("87681619", "Villabé"), //
	VILLAINES("87272021", "Villaines"), //
	VILLENEUVE_LA_GUYARD("87683102", "Villeneuve la Guyard"), //
	VILLENEUVE_LE_ROI("87545277", "Villeneuve le Roi"), //
	VILLENEUVE_PRAIRIE("87681858", "Villeneuve Prairie"), //
	VILLENEUVE_SAINT_GEORGES("87681825", "Villeneuve Saint-Georges"), //
	VILLENEUVE_TRIAGE("87681809", "Villeneuve Triage"), //
	VILLENNES_SUR_SEINE("87386649", "Villennes sur Seine"), //
	VILLEPARISIS_MITRY_LE_NEUF("87271510", "Villeparisis Mitry le Neuf"), //
	VILLEPINTE("87271452", "Villepinte"), //
	VILLEPREUX_LES_CLAYES("87393413", "Villepreux les Clayes"), //
	VILLIERS_LE_BEL_GONESSE_ARNOUVILLE("87276220", "Villiers le Bel Gonesse Arnouville"), //
	VILLIERS_MONTBARBIN("87116749", "Villiers Montbarbin"), //
	VILLIERS_NEAUPHLE_PONTCHARTRAIN("87393884", "Villiers Neauphle Pontchartrain"), //
	VILLIERS_SUR_MARNE_LE_PLESSIS_TRÉVISE("87113795", "Villiers sur Marne Le Plessis Trévise"), //
	VIROFLAY_RIVE_DROITE("87382887", "Viroflay Rive Droite"), //
	VIROFLAY_RIVE_GAUCHE("87393215", "Viroflay Rive Gauche"), //
	VIRY_CHÂTILLON("87681312", "Viry Châtillon"), //
	VITRY_SUR_SEINE("87545293", "Vitry sur Seine"), //
	VOSVES("87682500", "Vosves"), //
	VULAINES_SUR_SEINE_SAMOREAU("87682443", "Vulaines sur Seine Samoreau"), //
	YERRES("87682112", "Yerres");

	private final String uicCode;

	private final String name;

	private Station(String uicCode, String name) {
		this.uicCode = uicCode;
		this.name = name;
	}

	public String getUicCode() {
		return uicCode;
	}

	public String getName() {
		return name;
	}

	public static Station fromUicCode(String uicCode) {
		return Arrays.asList(values()).stream().filter(s -> s.getUicCode().equals(uicCode)).findAny().orElse(null);
	}
}
