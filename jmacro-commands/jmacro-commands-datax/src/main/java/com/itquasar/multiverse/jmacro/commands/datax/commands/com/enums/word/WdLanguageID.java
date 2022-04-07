package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlanguageid">https://docs.microsoft.com/en-us/office/vba/api/word.wdlanguageid</a>}
*/
public enum WdLanguageID implements COMEnum {
    
    /**@ African language. */
    wdAfrikaans(1078),    
    /**@ Albanian language. */
    wdAlbanian(1052),    
    /**@ Amharic language. */
    wdAmharic(1118),    
    /**@ Arabic language. */
    wdArabic(1025),    
    /**@ Arabic Algerian language. */
    wdArabicAlgeria(5121),    
    /**@ Arabic Bahraini language. */
    wdArabicBahrain(15361),    
    /**@ Arabic Egyptian language. */
    wdArabicEgypt(3073),    
    /**@ Arabic Iraqi language. */
    wdArabicIraq(2049),    
    /**@ Arabic Jordanian language. */
    wdArabicJordan(11265),    
    /**@ Arabic Kuwaiti language. */
    wdArabicKuwait(13313),    
    /**@ Arabic Lebanese language. */
    wdArabicLebanon(12289),    
    /**@ Arabic Libyan language. */
    wdArabicLibya(4097),    
    /**@ Arabic Moroccan language. */
    wdArabicMorocco(6145),    
    /**@ Arabic Omani language. */
    wdArabicOman(8193),    
    /**@ Arabic Qatari language. */
    wdArabicQatar(16385),    
    /**@ Arabic Syrian language. */
    wdArabicSyria(10241),    
    /**@ Arabic Tunisian language. */
    wdArabicTunisia(7169),    
    /**@ Arabic United Arab Emirates language. */
    wdArabicUAE(14337),    
    /**@ Arabic Yemeni language. */
    wdArabicYemen(9217),    
    /**@ Armenian language. */
    wdArmenian(1067),    
    /**@ Assamese language. */
    wdAssamese(1101),    
    /**@ Azeri Cyrillic language. */
    wdAzeriCyrillic(2092),    
    /**@ Azeri Latin language. */
    wdAzeriLatin(1068),    
    /**@ Basque (Basque). */
    wdBasque(1069),    
    /**@ Belgian Dutch language. */
    wdBelgianDutch(2067),    
    /**@ Belgian French language. */
    wdBelgianFrench(2060),    
    /**@ Bengali language. */
    wdBengali(1093),    
    /**@ Bulgarian language. */
    wdBulgarian(1026),    
    /**@ Burmese language. */
    wdBurmese(1109),    
    /**@ Belarusian language. */
    wdByelorussian(1059),    
    /**@ Catalan language. */
    wdCatalan(1027),    
    /**@ Cherokee language. */
    wdCherokee(1116),    
    /**@ Chinese Hong Kong SAR language. */
    wdChineseHongKongSAR(3076),    
    /**@ Chinese Macao SAR language. */
    wdChineseMacaoSAR(5124),    
    /**@ Chinese Singapore language. */
    wdChineseSingapore(4100),    
    /**@ Croatian language. */
    wdCroatian(1050),    
    /**@ Czech language. */
    wdCzech(1029),    
    /**@ Danish language. */
    wdDanish(1030),    
    /**@ Divehi language. */
    wdDivehi(1125),    
    /**@ Dutch language. */
    wdDutch(1043),    
    /**@ Edo language. */
    wdEdo(1126),    
    /**@ Australian English language. */
    wdEnglishAUS(3081),    
    /**@ Belize English language. */
    wdEnglishBelize(10249),    
    /**@ Canadian English language. */
    wdEnglishCanadian(4105),    
    /**@ Caribbean English language. */
    wdEnglishCaribbean(9225),    
    /**@ Indonesian English language. */
    wdEnglishIndonesia(14345),    
    /**@ Irish English language. */
    wdEnglishIreland(6153),    
    /**@ Jamaican English language. */
    wdEnglishJamaica(8201),    
    /**@ New Zealand English language. */
    wdEnglishNewZealand(5129),    
    /**@ Filipino English language. */
    wdEnglishPhilippines(13321),    
    /**@ South African English language. */
    wdEnglishSouthAfrica(7177),    
    /**@ Tobago Trinidad English language. */
    wdEnglishTrinidadTobago(11273),    
    /**@ United Kingdom English language. */
    wdEnglishUK(2057),    
    /**@ United States English language. */
    wdEnglishUS(1033),    
    /**@ Zimbabwe English language. */
    wdEnglishZimbabwe(12297),    
    /**@ Estonian language. */
    wdEstonian(1061),    
    /**@ Faeroese language. */
    wdFaeroese(1080),    
    /**@ Filipino language. */
    wdFilipino(1124),    
    /**@ Finnish language. */
    wdFinnish(1035),    
    /**@ French language. */
    wdFrench(1036),    
    /**@ French Cameroon language. */
    wdFrenchCameroon(11276),    
    /**@ French Canadian language. */
    wdFrenchCanadian(3084),    
    /**@ French (Congo (DRC)) language. */
    wdFrenchCongoDRC(9228),    
    /**@ French Cote d'Ivoire language. */
    wdFrenchCotedIvoire(12300),    
    /**@ French Haiti language. */
    wdFrenchHaiti(15372),    
    /**@ French Luxembourg language. */
    wdFrenchLuxembourg(5132),    
    /**@ French Mali language. */
    wdFrenchMali(13324),    
    /**@ French Monaco language. */
    wdFrenchMonaco(6156),    
    /**@ French Morocco language. */
    wdFrenchMorocco(14348),    
    /**@ French Reunion language. */
    wdFrenchReunion(8204),    
    /**@ French Senegal language. */
    wdFrenchSenegal(10252),    
    /**@ French West Indies language. */
    wdFrenchWestIndies(7180),    
    /**@ Frisian Netherlands language. */
    wdFrisianNetherlands(1122),    
    /**@ Fulfulde language. */
    wdFulfulde(1127),    
    /**@ Irish (Irish) language. */
    wdGaelicIreland(2108),    
    /**@ Scottish Gaelic language. */
    wdGaelicScotland(1084),    
    /**@ Galician language. */
    wdGalician(1110),    
    /**@ Georgian language. */
    wdGeorgian(1079),    
    /**@ German language. */
    wdGerman(1031),    
    /**@ German Austrian language. */
    wdGermanAustria(3079),    
    /**@ German Liechtenstein language. */
    wdGermanLiechtenstein(5127),    
    /**@ German Luxembourg language. */
    wdGermanLuxembourg(4103),    
    /**@ Greek language. */
    wdGreek(1032),    
    /**@ Guarani language. */
    wdGuarani(1140),    
    /**@ Gujarati language. */
    wdGujarati(1095),    
    /**@ Hausa language. */
    wdHausa(1128),    
    /**@ Hawaiian language. */
    wdHawaiian(1141),    
    /**@ Hebrew language. */
    wdHebrew(1037),    
    /**@ Hindi language. */
    wdHindi(1081),    
    /**@ Hungarian language. */
    wdHungarian(1038),    
    /**@ Ibibio language. */
    wdIbibio(1129),    
    /**@ Icelandic language. */
    wdIcelandic(1039),    
    /**@ Igbo language. */
    wdIgbo(1136),    
    /**@ Indonesian language. */
    wdIndonesian(1057),    
    /**@ Inuktitut language. */
    wdInuktitut(1117),    
    /**@ Italian language. */
    wdItalian(1040),    
    /**@ Japanese language. */
    wdJapanese(1041),    
    /**@ Kannada language. */
    wdKannada(1099),    
    /**@ Kanuri language. */
    wdKanuri(1137),    
    /**@ Kashmiri language. */
    wdKashmiri(1120),    
    /**@ Kazakh language. */
    wdKazakh(1087),    
    /**@ Khmer language. */
    wdKhmer(1107),    
    /**@ Kirghiz language. */
    wdKirghiz(1088),    
    /**@ Konkani language. */
    wdKonkani(1111),    
    /**@ Korean language. */
    wdKorean(1042),    
    /**@ Kyrgyz language. */
    wdKyrgyz(1088),    
    /**@ No specified language. */
    wdLanguageNone(0),    
    /**@ Lao language. */
    wdLao(1108),    
    /**@ Latin language. */
    wdLatin(1142),    
    /**@ Latvian language. */
    wdLatvian(1062),    
    /**@ Lithuanian language. */
    wdLithuanian(1063),    
    /**@ Macedonian (FYROM) language. */
    wdMacedonianFYROM(1071),    
    /**@ Malayalam language. */
    wdMalayalam(1100),    
    /**@ Malay Brunei Darussalam language. */
    wdMalayBruneiDarussalam(2110),    
    /**@ Malaysian language. */
    wdMalaysian(1086),    
    /**@ Maltese language. */
    wdMaltese(1082),    
    /**@ Manipuri language. */
    wdManipuri(1112),    
    /**@ Marathi language. */
    wdMarathi(1102),    
    /**@ Mexican Spanish language. */
    wdMexicanSpanish(2058),    
    /**@ Mongolian language. */
    wdMongolian(1104),    
    /**@ Nepali language. */
    wdNepali(1121),    
    /**@ Disables proofing if the language ID identifies a language in which an object is grammatically validated using the Microsoft Word proofing tools. */
    wdNoProofing(1024),    
    /**@ Norwegian Bokmol language. */
    wdNorwegianBokmol(1044),    
    /**@ Norwegian Nynorsk language. */
    wdNorwegianNynorsk(2068),    
    /**@ Oriya language. */
    wdOriya(1096),    
    /**@ Oromo language. */
    wdOromo(1138),    
    /**@ Pashto language. */
    wdPashto(1123),    
    /**@ Persian language. */
    wdPersian(1065),    
    /**@ Polish language. */
    wdPolish(1045),    
    /**@ Portuguese language. */
    wdPortuguese(2070),    
    /**@ Portuguese (Brazil) language. */
    wdPortugueseBrazil(1046),    
    /**@ Punjabi language. */
    wdPunjabi(1094),    
    /**@ Rhaeto Romanic language. */
    wdRhaetoRomanic(1047),    
    /**@ Romanian language. */
    wdRomanian(1048),    
    /**@ Romanian Moldova language. */
    wdRomanianMoldova(2072),    
    /**@ Russian language. */
    wdRussian(1049),    
    /**@ Russian Moldova language. */
    wdRussianMoldova(2073),    
    /**@ Sami Lappish language. */
    wdSamiLappish(1083),    
    /**@ Sanskrit language. */
    wdSanskrit(1103),    
    /**@ Serbian Cyrillic language. */
    wdSerbianCyrillic(3098),    
    /**@ Serbian Latin language. */
    wdSerbianLatin(2074),    
    /**@ Sesotho language. */
    wdSesotho(1072),    
    /**@ Simplified Chinese language. */
    wdSimplifiedChinese(2052),    
    /**@ Sindhi language. */
    wdSindhi(1113),    
    /**@ Sindhi (Pakistan) language. */
    wdSindhiPakistan(2137),    
    /**@ Sinhalese language. */
    wdSinhalese(1115),    
    /**@ Slovakian language. */
    wdSlovak(1051),    
    /**@ Slovenian language. */
    wdSlovenian(1060),    
    /**@ Somali language. */
    wdSomali(1143),    
    /**@ Sorbian language. */
    wdSorbian(1070),    
    /**@ Spanish language. */
    wdSpanish(1034),    
    /**@ Spanish Argentina language. */
    wdSpanishArgentina(11274),    
    /**@ Spanish Bolivian language. */
    wdSpanishBolivia(16394),    
    /**@ Spanish Chilean language. */
    wdSpanishChile(13322),    
    /**@ Spanish Colombian language. */
    wdSpanishColombia(9226),    
    /**@ Spanish Costa Rican language. */
    wdSpanishCostaRica(5130),    
    /**@ Spanish Dominican Republic language. */
    wdSpanishDominicanRepublic(7178),    
    /**@ Spanish Ecuadorian language. */
    wdSpanishEcuador(12298),    
    /**@ Spanish El Salvadorian language. */
    wdSpanishElSalvador(17418),    
    /**@ Spanish Guatemala language. */
    wdSpanishGuatemala(4106),    
    /**@ Spanish Honduran language. */
    wdSpanishHonduras(18442),    
    /**@ Spanish Modern Sort language. */
    wdSpanishModernSort(3082),    
    /**@ Spanish Nicaraguan language. */
    wdSpanishNicaragua(19466),    
    /**@ Spanish Panamanian language. */
    wdSpanishPanama(6154),    
    /**@ Spanish Paraguayan language. */
    wdSpanishParaguay(15370),    
    /**@ Spanish Peruvian language. */
    wdSpanishPeru(10250),    
    /**@ Spanish Puerto Rican language. */
    wdSpanishPuertoRico(20490),    
    /**@ Spanish Uruguayan language. */
    wdSpanishUruguay(14346),    
    /**@ Spanish Venezuelan language. */
    wdSpanishVenezuela(8202),    
    /**@ Sutu language. */
    wdSutu(1072),    
    /**@ Swahili language. */
    wdSwahili(1089),    
    /**@ Swedish language. */
    wdSwedish(1053),    
    /**@ Swedish Finnish language. */
    wdSwedishFinland(2077),    
    /**@ Swiss French language. */
    wdSwissFrench(4108),    
    /**@ Swiss German language. */
    wdSwissGerman(2055),    
    /**@ Swiss Italian language. */
    wdSwissItalian(2064),    
    /**@ Syriac language. */
    wdSyriac(1114),    
    /**@ Tajik language. */
    wdTajik(1064),    
    /**@ Tamazight language. */
    wdTamazight(1119),    
    /**@ Tamazight Latin language. */
    wdTamazightLatin(2143),    
    /**@ Tamil language. */
    wdTamil(1097),    
    /**@ Tatar language. */
    wdTatar(1092),    
    /**@ Telugu language. */
    wdTelugu(1098),    
    /**@ Thai language. */
    wdThai(1054),    
    /**@ Tibetan language. */
    wdTibetan(1105),    
    /**@ Tigrigna Eritrea language. */
    wdTigrignaEritrea(2163),    
    /**@ Tigrigna Ethiopic language. */
    wdTigrignaEthiopic(1139),    
    /**@ Traditional Chinese language. */
    wdTraditionalChinese(1028),    
    /**@ Tsonga language. */
    wdTsonga(1073),    
    /**@ Tswana language. */
    wdTswana(1074),    
    /**@ Turkish language. */
    wdTurkish(1055),    
    /**@ Turkmen language. */
    wdTurkmen(1090),    
    /**@ Ukrainian language. */
    wdUkrainian(1058),    
    /**@ Urdu language. */
    wdUrdu(1056),    
    /**@ Uzbek Cyrillic language. */
    wdUzbekCyrillic(2115),    
    /**@ Uzbek Latin language. */
    wdUzbekLatin(1091),    
    /**@ Venda language. */
    wdVenda(1075),    
    /**@ Vietnamese language. */
    wdVietnamese(1066),    
    /**@ Welsh language. */
    wdWelsh(1106),    
    /**@ Xhosa language. */
    wdXhosa(1076),    
    /**@ Yi language. */
    wdYi(1144),    
    /**@ Yiddish language. */
    wdYiddish(1085),    
    /**@ Yoruba language. */
    wdYoruba(1130),    
    /**@ Zulu language. */
    wdZulu(1077);

    private final long value;

    WdLanguageID(long value) {
        this.value = value;
    }

    @Override
    public Variant toVariant() {
        return new Variant(this.value);
    }

    @Override
    public long getValue() {
        return this.value;
    }
}
