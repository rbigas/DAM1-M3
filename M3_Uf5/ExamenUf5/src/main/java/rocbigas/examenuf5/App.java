package rocbigas.examenuf5;

/**
 *
 * @author rocbigas
 */
public class App {

    static String[][] personesInici = {
        {"Felice", "Woodbridge", "1955-08-25", "fwoodbridge0@dedecms.com", "Albrechtice", "100-902-8066", "Thoughtsphere", "17146.73"},
        {"Karine", "Brixey", "1951-03-31", "kbrixey1@answers.com", "Nzeto", "371-276-4911", "Thoughtsphere", "13940.32"},
        {"Geoffry", "Mangion", "1979-02-03", "gmangion2@discovery.com", "Tutnae", "837-342-2040", "Photolist", "18312.0"},
        {"Maureen", "Scallan", "1985-12-02", "mscallan3@pcworld.com", "Vénissieux", "239-198-8694", "Thoughtsphere", "15428.0"},
        {"Junid", "Joanaud", "1987-07-15", "jjoanaud4@flickr.com", "Herzliya Pituah", "461-398-7331", "Thoughtsphere", "17811.59"},
        {"Hilary", "Coils", "1989-06-07", "hcoils5@wsj.com", "Puerto Aisén", "267-636-6847", "Thoughtsphere", "17964.61"},
        {"Bradford", "Coaster", "1984-04-26", "bcoaster6@cdbaby.com", "Vyshniy Volochëk", "254-790-4910", "Photolist", "16521.32"},
        {"Emery", "Braunes", "1982-07-23", "ebraunes7@liveinternet.ru", "Nagoya-shi", "560-949-8843", "Photolist", "17309.25"},
        {"Orella", "Causnett", "1987-08-30", "ocausnett8@dailymail.co.uk", "Lingyuan", "719-209-1205", "Thoughtsphere", "15532.84"},
        {"Frederica", "Delhanty", "1992-09-18", "fdelhanty9@cdbaby.com", "Kärdla", "703-445-5178", "Photolist", "15898.0"},
        {"Jacquenetta", "Camblin", "1977-01-09", "jcamblina@samsung.com", "Żebbuġ", "162-476-6411", "Photolist", "11678.9"},
        {"Christoph", "Clineck", "1976-05-21", "cclineckb@webs.com", "Xiniqi", "853-813-4310", "Photolist", "14335.19"},
        {"Joete", "Josebury", "1982-06-22", "jjoseburyc@vinaora.com", "Changwon", "290-903-4496", "Thoughtsphere", "14346.54"},
        {"Janith", "Ziem", "1982-07-20", "jziemd@msn.com", "Tabira", "459-505-4489", "Thoughtsphere", "14195.63"},
        {"Hartley", "Snarr", "1958-03-04", "hsnarre@home.pl", "Prosperous", "167-369-6231", "Thoughtsphere", "10227.4"},
        {"Gena", "Alekseicik", "1971-10-19", "galekseicikf@mysql.com", "Buchach", "486-701-5227", "Photolist", "18507.38"},
        {"Katharina", "Pulhoster", "1977-06-11", "kpulhosterg@vistaprint.com", "Dārāb", "742-386-9384", "Thoughtsphere", "10482.1"},
        {"Keen", "Alderwick", "1959-03-31", "kalderwickh@youtube.com", "Taposan", "493-361-7690", "Thoughtsphere", "15933.01"},
        {"Aubrette", "Benwell", "1961-06-04", "abenwelli@flickr.com", "Juvisy-sur-Orge", "568-285-6235", "Thoughtsphere", "14853.45"},
        {"Felice", "Woodbridge", "1955-08-25", "fwoodbridge0@dedecms.com", "Albrechtice", "100-902-8066", "Thoughtsphere", "17146.73"},
        {"Karine", "Brixey", "1951-03-31", "kbrixey1@answers.com", "Nzeto", "371-276-4911", "Thoughtsphere", "13940.32"},
        {"Geoffry", "Mangion", "1979-02-03", "gmangion2@discovery.com", "Tutnae", "837-342-2040", "Photolist", "18312.0"},
        {"Maureen", "Scallan", "1985-12-02", "mscallan3@pcworld.com", "Vénissieux", "239-198-8694", "Thoughtsphere", "15428.0"},
        {"Junie", "Joanaud", "1987-07-15", "jjoanaud4@flickr.com", "Herzliya Pituah", "461-398-7331", "Thoughtsphere", "17811.59"},
        {"Hilary", "Coils", "1989-06-07", "hcoils5@wsj.com", "Puerto Aisén", "267-636-6847", "Thoughtsphere", "17964.61"},
        {"Bradford", "Coaster", "1984-04-26", "bcoaster6@cdbaby.com", "Vyshniy Volochëk", "254-790-4910", "Photolist", "16521.32"},
        {"Juan", "Bellamy", "1967-11-04", "jbellamyj@ameblo.jp", "Pyskowice", "357-830-5280", "Photolist", "11888.37"},
        {"Philippine", "Pezey", "1950-08-31", "ppezeyk@studiopress.com", "Camagüey", "515-268-8508", "Thoughtsphere", "14318.69"},
        {"Blaire", "Elderidge", "1951-03-26", "belderidgel@wired.com", "Verbivka", "409-728-6989", "Photolist", "15943.13"},
        {"Felice", "Woodbridge", "1955-08-25", "fwoodbridge0@dedecms.com", "Albrechtice", "100-902-8066", "Thoughtsphere", "17146.73"},
        {"Karine", "Brixey", "1951-03-31", "kbrixey1@answers.com", "Nzeto", "371-276-4911", "Thoughtsphere", "13940.32"},
        {"Geoffry", "Mangion", "1979-02-03", "gmangion2@discovery.com", "Tutnae", "837-342-2040", "Photolist", "18312.0"},
        {"Maureen", "Scallan", "1985-12-02", "mscallan3@pcworld.com", "Vénissieux", "239-198-8694", "Thoughtsphere", "15428.0"},
        {"Junie", "Joanaud", "1987-07-15", "jjoanaud4@flickr.com", "Herzliya Pituah", "461-398-7331", "Thoughtsphere", "17811.59"},
        {"Hilary", "Coils", "1989-06-07", "hcoils5@wsj.com", "Puerto Aisén", "267-636-6847", "Thoughtsphere", "17964.61"},
        {"Bradford", "Coaster", "1984-04-26", "bcoaster6@cdbaby.com", "Vyshniy Volochëk", "254-790-4910", "Photolist", "16521.32"},
        {"Trumann", "Folliss", "1957-04-16", "tfollissm@ox.ac.uk", "Chirongui", "428-941-6322", "Thoughtsphere", "10958.68"},
        {"Megan", "Goodoune", "1980-09-02", "mgoodounen@rakuten.co.jp", "Ban Phan Don", "515-355-9082", "Photolist", "18610.68"},
        {"Chicky", "Buckmaster", "1976-10-19", "cbuckmastero@hatena.ne.jp", "Tvŭrditsa", "726-365-5823", "Thoughtsphere", "16184.52"},
        {"Sloan", "Earle", "1975-11-14", "searlep@arizona.edu", "San Miguel del Padrón", "896-763-7133", "Thoughtsphere", "16727.64"},
        {"Christyna", "Andreone", "1990-03-01", "candreoneq@wired.com", "Nakhon Pathom", "170-797-9668", "Photolist", "14360.82"},
        {"Dianemarie", "Morphew", "1968-07-28", "dmorphewr@trellian.com", "Ban Khlong Bang Sao Thong", "687-710-3222", "Thoughtsphere", "13637.5"},
        {"Hildagard", "Davenall", "1972-04-26", "hdavenalls@cdbaby.com", "Abreus", "659-971-1111", "Photolist", "18958.15"},
        {"Nelson", "Vasyunichev", "1994-03-13", "nvasyunichevt@nature.com", "Sayapullo", "123-696-9523", "Photolist", "11228.41"},
        {"Ardath", "Malenoir", "1958-07-16", "amalenoiru@hexun.com", "Mao", "249-183-9428", "Thoughtsphere", "17406.47"},
        {"Elsinore", "Wellum", "1999-07-25", "ewellumv@ca.gov", "Paris 05", "432-361-5971", "Thoughtsphere", "17467.02"},
        {"Letizia", "Genny", "1975-08-22", "lgennyw@parallels.com", "Loughrea", "618-338-6410", "Photolist", "16203.4"},
        {"Chelsie", "Warton", "1969-01-30", "cwartonx@census.gov", "Concepcion", "838-727-4760", "Photolist", "16941.79"},
        {"Beale", "McLagain", "1950-12-24", "bmclagainy@altervista.org", "Mombok", "445-385-8387", "Thoughtsphere", "17910.74"},
        {"Steward", "Candlin", "1951-04-11", "scandlinz@storify.com", "Skópelos", "964-522-3947", "Photolist", "12855.47"},
        {"Benedict", "Poyle", "1976-11-30", "bpoyle10@networkadvertising.org", "Joroinen", "403-472-4099", "Photolist", "11817.38"},
        {"Theobald", "Phipson", "1974-02-24", "tphipson11@dell.com", "Xidoupu", "365-897-1684", "Photolist", "12145.75"},
        {"Margareta", "Minithorpe", "1969-08-22", "mminithorpe12@nps.gov", "Tinumpuk", "256-429-5427", "Photolist", "14729.52"},
        {"Wallas", "Denisovich", "1995-07-08", "wdenisovich13@github.com", "Shicang", "424-165-9815", "Thoughtsphere", "12633.91"},
        {"Jerad", "Scadden", "1971-10-26", "jscadden14@tripadvisor.com", "Thouars", "471-126-0251", "Thoughtsphere", "11204.0"},
        {"Eugine", "Bligh", "1998-12-06", "ebligh15@google.com.au", "Ziguinchor", "296-163-2560", "Photolist", "12510.32"},
        {"Eduard", "Scawn", "1978-08-27", "escawn16@ning.com", "Emiliano Zapata", "882-222-3203", "Photolist", "19197.83"},
        {"Ladonna", "Kitt", "1993-04-15", "lkitt17@dyndns.org", "Kembé", "180-637-6459", "Photolist", "19211.85"},
        {"Mayor", "Verring", "1953-03-21", "mverring18@sbwire.com", "Bagnères-de-Bigorre", "770-244-4177", "Thoughtsphere", "15741.04"},
        {"Galen", "Dailey", "1982-01-17", "gdailey19@spiegel.de", "Buenavista", "579-723-6616", "Photolist", "10540.48"},
        {"Birdie", "Grollmann", "1976-12-10", "bgrollmann1a@nps.gov", "Jiangwan", "327-709-7021", "Thoughtsphere", "11096.31"},
        {"Gabriell", "Luis", "1999-10-18", "gluis1b@dmoz.org", "Şūrān", "695-181-1951", "Thoughtsphere", "11393.58"},
        {"Karilynn", "Huyton", "1967-03-24", "khuyton1c@thetimes.co.uk", "Czerniewice", "981-179-4903", "Photolist", "17911.17"},
        {"Duffie", "Rowbottam", "1990-03-22", "drowbottam1d@csmonitor.com", "Kembang", "740-644-8951", "Thoughtsphere", "12101.54"}
    };

    public static void main(String[] args) {

        Persones persones = new Persones();

        for (String[] s : personesInici) {
            persones.add(new Persona(s[0],
                    s[1],
                    s[2],
                    s[3],
                    s[4],
                    s[5],
                    s[6],
                    s[7]
            ));

        }

        persones.primeres5();
        persones.nPersones();
        for (Persona p : persones) {
            System.out.println(p);
        }
        persones.sort();
        persones.primeres5();
        persones.sortByDate();
        persones.primeres5();
        persones.eliminaDuplicats();
        persones.nPersones();
        persones.personesPerEmpresa();
    }

}
