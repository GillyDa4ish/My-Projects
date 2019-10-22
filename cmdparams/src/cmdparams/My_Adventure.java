package cmdparams;

import java.util.Scanner;

public class My_Adventure {
	public void start(Scanner input) {
		 System.out.println("Welcome to Aokigahara");
		 System.out.println("It is Friday the 13th and there is a tree with knife marks and large amounts of blood");
		 
		 while (true) {
			 System.out.println("Examine tree or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option1(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option2(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option1(Scanner input) {
		 System.out.println("the tree seems to be slowly dying itself and you can smell the stench of rotting human carcases *A CHILL GOES DOWN YOUR SPINE*");
		 
		 while (true) {
			 System.out.println("Examine tree or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option3(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option2(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option3(Scanner input) {
		 System.out.println(" a finger touches your shoulder and you turn around");
		 System.out.println(" You Died");

		 System.out.println("'..............''...',;:cloddxkkxdkKNX0Okxxxkxdoc;,:llloddkxxdlodddddddddoodxdxddoooool,;lolcccc::::\r\n" + 
		 		"...................';:cloodxxxxxOKNNX0Okxxoccc:,...';cloooldOkocccccloololldxxxxxddxdoc;looooooollll\r\n" + 
		 		"..''''....''....',;:clodddddxOKXWWN0Okxdl;'',;::;;,,,',:lllokOkc;:::;;;;::;cloodddxxdc:ldddddxdooooo\r\n" + 
		 		".',''''',,,''..';:clooddddk0XWWWWN0xxxo;.,cxO000000Oko;..;oxxkOo;::;;,,,;,';:::::ccloc:ddoloxkxdoddd\r\n" + 
		 		".......''...'',;clllodoood0NWWWN0xollc,.:kKXXXXNNXXXKK0d:..:lxko;;;,,,,,,'',;,,,;;;;'..';,.'cdooddxx\r\n" + 
		 		",,,'''','....';clooool:;,;cdkOxlcccc;..cOXNWNNNNXXNNNXXKOl. .:dd;.'',,,,,,'',''';;'.........',,;:cll\r\n" + 
		 		",,'''';;;;;;,;:cloool:'.....'';:cll:..;kKXXkoxKNNOclxKKKK0o. .lxc..','',,'..''......... .....,,;;;;;\r\n" + 
		 		".........',,;;;:::cc::;,..''.';ccoo, .lOKNk. .kWNc  .lKXK0Oc. ;xo'..'........'....   ..  .. .''',:;;\r\n" + 
		 		"...........';;;;;;;;;;;,,'..'''';ol. .o0X0;  'OWWd'. .:OXKOo. .ld,..........'''...    .   .  ...';''\r\n" + 
		 		"...........';;;;;;;;;;;::;'...',,l:. ,kOl'   lNWWXO:   .cxOOc .:x:..........'''...   ..  ..   ...,;;\r\n" + 
		 		"............,,;;,,,;:::;,'....'';l;.,xc.   .lKNOkKWKo'    .l0c ,do'.'...''...''....   .   .   ...,ll\r\n" + 
		 		"............,,;;;,,;;,,''......':o,.o0;..,ckXKo'':oOKOdc;,,dXl 'od;...'.''........   ..  ...  ...';'\r\n" + 
		 		"''''...,:::;;;;;;;;;,..........'cd; 'kX00XXKXXkO0Ok0X0KXXXXXx. .cdo:;,;,.......''''',,...''.......'.\r\n" + 
		 		"',,',ck0KK0Okxkxdolcc;,''.......cd,  .o000KKNNK0OOKKXXXKOKOc.  .:xddc;:oolc;..';,;:;.........',....'\r\n" + 
		 		"cOOookkOKK0kxkkxkkdllc::;'.....;od;.  .,d00XXo......cKXKKx;...  ,ddxd,':llcclol;;;'...........'....'\r\n" + 
		 		"ckOoclodolcldxo:cxxc;,;;'.....,lxx;    ..:xX0'  ... .dX0o'...   .codxl;,....'::,;ol'....'....... ...\r\n" + 
		 		";loc,'''';::,..;ol;'',,,''....'oxo'    .. :K0, ......lXk,....    .;::odl;......'cdx:',;,...''.....',\r\n" + 
		 		"c;;:;,;:;'...';,.  .,ol;,.....;ddc.    ....dXl...'''.oNd.....    .'',lo,.'.  ..,cl::,',;,'...... .';\r\n" + 
		 		":::;,,:;'.,;,'.    .odc:,.....:oc,.     ...'xO;...'..dK:...       .'.'cc,;,.....,;''..;;,''..... .,:\r\n" + 
		 		",'...',,,'''....  .cdlool;'..':,..       ...'kd.    .kx.         ....'xklcc:,.  .....',,...... ...,;\r\n" + 
		 		",...............  ,ooloodxxo:;'.          ...:k;    'kc          ..';:lodkkddl:.    ..............',\r\n" + 
		 		",.............   .lllcclloolokdl;,.           ld.   ;k,           .','',cdl,;cllc'    .. ..     .,;;\r\n" + 
		 		",......  .....  .:llloloddxocloxOkdl;..       ,x,   :x.          . ....'::..,::col;.  ......... .,'.\r\n" + 
		 		",........      .:doddxddooxxl:ccclokOd;...    .d:   ;d.               ..'....';:;;,.   .........';::\r\n" + 
		 		"'.   ...       .:loodxxxolodo:.. .,;ld;.;ol,.  cl. .ll.   ..      ... .... ...''................',,'\r\n" + 
		 		":..  ......  .',;oxkkkkkxoolloc,. .''ldo;.,cdl..::;::.         .. .........   .....  ..'............\r\n" + 
		 		"ooc. ....'.   ;lldxkkkkOkdxo:::,. .:c'.,c;..:c;c'..            .     .....  ..       ...............");}
	
	
	public void option2(Scanner input) {
		 System.out.println("Good choice. There's a log cabin up ahead");
		 
		 while (true) {
			 System.out.println("Examine Log Cabin or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option4(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option5(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	
	public void option4(Scanner input) {
		 System.out.println("The Cabins lights are on and all you can see is what looks to be a shrine");
		 
		 while (true) {
			 System.out.println("Examine Log Cabin or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 JasonVorheesDeath(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option5(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void  JasonVorheesDeath(Scanner input) {
		 System.out.println("you walk into the cabin and then all of the sudden you turn around and");
		 System.out.println("                    ...    ..   ..          .                                                                               ...... ...                \r\n" + 
		 		"                    .......... .....                                                                                       .........                  \r\n" + 
		 		"               .  .......................   ...                                       ..';:;colc:,'..                      .........                  \r\n" + 
		 		"               .............'',;;,'''...'..........                                 .:oxo::cxOkdcll:;'..                     .........        .       \r\n" + 
		 		"                ..........';:;,;;;;;,,'',,'..........   .                         .:ldkkkkOOOOOklcol:,,'..                                            \r\n" + 
		 		"               ..........';::;;::ccc::;,,,,,'.......                             'ldodkkkkkO0000xlodl::,''.                                           \r\n" + 
		 		"                ........';ccccccccccccc:;;:;,'.....                             .oxxdoxOO0000kOKOddxdoc;,;;.     .                                    \r\n" + 
		 		"                 .......,ccccccllcccccllcc::;,.....                            .:xxkxox0OdkKOoclc:;,';::;'....                                        \r\n" + 
		 		"   ...            ......,c::ccccccccccccccc::;'...                             .lxxkkxxko::c:;'.      .,::'...       .                                \r\n" + 
		 		" .....             .....'cl::::::cc:::ccccc::,.....                            .ldxd:'....,cdxo,.    ...,ldo;..                                       \r\n" + 
		 		" ......             .....,clccc:;::::cllcc::;......              .......       .:ox:      ;oOKOdc,',:c;'.:odl,.      ..                               \r\n" + 
		 		"......               .....':lool:::cclllcc:,......     .       ...........    ..'cx:     .:ooxo:clllccc,',:ol,.      ..                               \r\n" + 
		 		"....                ........';:ccccccccc:,'.......        ... ..............  ...:xo'.',;:c:.   ..;:;'...:llc,.                                       \r\n" + 
		 		"                  ..............''',,,'...........        ................... . .lxdc',;:c;.      .,'..  :xo;'.                                       \r\n" + 
		 		"               .......   ........................          ......   ........    .;dolc;.';,.      ..     .::'.                                        \r\n" + 
		 		"              ........ ..........................             ...    ...         .lxlol.....              .....         .            .                \r\n" + 
		 		"            ..........        ........  ...     .                   .....         'oddd:.                 .....                      .                \r\n" + 
		 		"            ...........        ....   ...                      .... ... ..         .cl,;'.                     ...                   .                \r\n" + 
		 		"            ........ ..         ...   ..                        .'. .. ...          .':l:'.                       ...                                 \r\n" + 
		 		"            ......                                              ......'..     ...  ....;c;..                        ...                               \r\n" + 
		 		"                                                                 ..'',;,..     ...  ........                           .............                  \r\n" + 
		 		"                                                                 .....,:...... .............                           .',,,,,,,,,,''...              \r\n" + 
		 		"                                                                  ....',..............                                 .,;,''',,;;,;,,'....           \r\n" + 
		 		"                                                                 .. ..','.......   ..                                 .',,'.''''',,,;,'....  ...      \r\n" + 
		 		"                                                                ....''';,.......                              ......'''''''',,''..',,'..... ......    \r\n" + 
		 		"                                                                ................                            ....',;,'''''''''',,...''....   .......   \r\n" + 
		 		"                                    .                           ....  .........                            ..',;;,''''''.......''....     ........... \r\n" + 
		 		"                                    ..                          ..   ..........                           ..,,;;,',,,,,,,''''.'''...      ............\r\n" + 
		 		"                              ...'''........                   ..     ................                  ....,;;;::::;;;;;,,;;;;;'...     ........   ..\r\n" + 
		 		"                          ..,:loddolc:,'......                        .....  ........                 ...''.  ..................   .      ............\r\n" + 
		 		"                     .,::clodxkkOkkxxdoc;'......                    .....      ... .....          ........''.                            ....      ...\r\n" + 
		 		"                  .';cdddxddllcoxOOOOkkxol;...               ...........       .....'....      . ..........''...............              .......     \r\n" + 
		 		"                   .';::cllolclccoxO00Oko:'''...              ....      ....  ....''.........    ........',,,,,,,,''''..........           ...........\r\n" + 
		 		"                     ..;::::;::;;;::clc'.  .;cl:,.            ...             ..''................'''.',,,,,,,,'''''............           ...........\r\n" + 
		 		"                       ..,;;,,''...  .       ..:cc;.         ..              ..''................,,,''...''',,''''.''...........                 .....\r\n" + 
		 		"                         ..','..    ...         .';c:.                      ..............'''''..........''''''''''''...........                    ..\r\n" + 
		 		"                            ....   ....            .';;'.       .          ...........................''''''....'''........                           \r\n" + 
		 		"                            ..,......'...   ....      .,,'.     ..       ..................''..............   ..... ..                                \r\n" + 
		 		"                            .... .   ..............     ..,'.  ...     .... ..............'..........  .            ..                                \r\n" + 
		 		"                             ..  .      ..............     .,,.','.  ....'............................   ..                                           \r\n" + 
		 		"                              ..          ........'......  ...';;;;,'.....................     ........  ....                                         \r\n" + 
		 		"                                           ................. .....'...........  .......         .......    ....                                       \r\n" + 
		 		"                                 .       .  ......  ......      ..............  .......         .......      ....                                     \r\n" + 
		 		"                                                  .. ....  .       .....  ....   ....              ......      ...                                    \r\n" + 
		 		"                                           ..  .        ...              ..'..   ...                ......       ...                                  \r\n" + 
		 		"                                                .       ..                .,,,.   ..           .     .......      ....                                \r\n" + 
		 		"");
		 System.out.println("You Died");
	}
	
	public void option5(Scanner input) {
		 System.out.println("Good Choice. There's A Small House Up Ahead");
		
		 
		 while (true) {
			 System.out.println("Examine house or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option6(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option7(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option6(Scanner input) {
		 System.out.println("You go inside and you here a tapping on the window");
		 
		 while (true) {
			 System.out.println("Examine window or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 MichaelMyersDeath(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option7(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void MichaelMyersDeath(Scanner input) {
		 System.out.println("You look out the window and there's a man standing right out side you look away and back and he's gone all of the sudden there's a stabbing pain in your chest you turn and see");
		 System.out.println("...   ...                                                              ..     .........                   ...':lodxxxxxxxxxdxdddddoool:;'',;:ccc;,'...\r\n" + 
		 		"     ........                             ..                       ............   ............               ...',;cldxxxxxxxxxxxddddoollc:;;;;::c::,'\r\n" + 
		 		"  ...............                        .......             ....................       ............              ....,;clddxxxxxxdddddoddoollc:;;;:::\r\n" + 
		 		"............ ..........                ...............              ..............            ............              ...';:lodxxxxddddddddddddolc::\r\n" + 
		 		".............................         ...............                 .............                 ................         ...',:clodddddddddddddddd\r\n" + 
		 		" .....'''...........................................      .......    ........''.....                     .............            ....,;:loddddddddddd\r\n" + 
		 		"        .....'''''''..............................     ....',;;;;,'..........'........                        ..............            ...';:loddxxdd\r\n" + 
		 		"               .....'''''''......................    .....',;::ccccllcc:;'......','....                              ...........   .         ...',:cod\r\n" + 
		 		"                       .....''''''.............    .......';;::clloooddxxdl:,....''........                               ............   .        ....\r\n" + 
		 		"                               ....''''''.....    . .......,:clolooddddxxxxxxdc..'''.............                               ............          \r\n" + 
		 		"                                      .......   ..    ......':ccloodxkkkOkkkkOkoc;'....................                              ............     \r\n" + 
		 		"                                               ..         ...''',:ldkOO0K0OOkkOkdl,...........................                             ...........\r\n" + 
		 		"                                              ...           ....',;:oxkOKKOOkkkkxo;.................................                             .....\r\n" + 
		 		"                                             ..... ....     .:c;''',;coxOOOOkxkxdd:.....................................                              \r\n" + 
		 		"                                            ....''..;:;'...;d0d'. ...,cdkOkkkxxdooc...........................................                        \r\n" + 
		 		"                                            ........''...:x0K0o.     .'coxxddollll;...............................................                    \r\n" + 
		 		"                                           ........     .ck0Okko'.     .cllollllc;. .......''........................................                 \r\n" + 
		 		"                                           ..  ...       .;oxxkkl;'... .:lcclllc;.          ...............................................           \r\n" + 
		 		"                                          ....  ...... ....:dddxxollloccloooolc;.                  .......................................            \r\n" + 
		 		"                                          .        .;;;ldl;cccoodxkOOOkddxdddlc:'.                         ............................               \r\n" + 
		 		"                                          .         .,lk00Oko:cloxxkkxdxkkxdollc,.                                ..................                ..\r\n" + 
		 		"                                          ...      .. .cxkxxo,,coodxxxdddolc:;;,.                                         ...........            .....\r\n" + 
		 		"                                            ...... ..''.';:od:,:cllolllllccc:;,.                                                ....   ...............\r\n" + 
		 		"                                             ..;::;'.'loc,':doc::::::ccc:ccc:,.                                                           ............\r\n" + 
		 		"                                               .':ll;,codl;;loollc::::;'.'...                                                                   ......\r\n" + 
		 		"                                                 ..;:::clc:;clccc:;'..                                                                                \r\n" + 
		 		"                                                   ....'....,,,,;:,                                                                                   \r\n" + 
		 		"                                                        ...',;;;c:.                                                                                   \r\n" + 
		 		"                                                  ......'';:ccc::.                                                                                    \r\n" + 
		 		"                                                  ......',;:cc:,.         .....                                                                       \r\n" + 
		 		"                                                  .....',,,;,'.              ..                                                                       \r\n" + 
		 		"                                                  ...'',,''.                                                                                          \r\n" + 
		 		"                                         .  ....  .....'...        ..                                                                                 \r\n" + 
		 		"         ..                             ..............            ..       ........                                                                   \r\n" + 
		 		"       ...     .                        .............    ..     ....    .....  ........                                                               \r\n" + 
		 		"      ...    ..                           .........     ..     ...     ......  ...........                                                            \r\n" + 
		 		"     ...    ..             .                .....      ...    .......  ....... .............                                                          \r\n" + 
		 		"    ..     ...           ....                ....     ...     ......   ....... ..............                                                         ");
		 
		 System.out.println("You Died");
	}
	
	public void option7(Scanner input) {
		 System.out.println("Good Choice. There's A Random Sewer Drain Next To The House");
		
		 
		 while (true) {
			 System.out.println("Examine Sewer Drain or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option8(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option9(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option8(Scanner input) {
		 System.out.println("There Is Water Running To The Sewer Drain");
		 
		 
		 while (true) {
			 System.out.println("Examine Sewer Drain or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 ITdeath(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option9(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	
	public void ITdeath(Scanner input) {
		 System.out.println("There is a creepy laugh and a pair of white hands lunge out grab you into the Sewer and the last thing you see is");
		 System.out.println("0OOOOOOkddO0Oxxxxdldkkxxxddddddxdooc:,''''....',;l0NNXXNWNX00K00Okdlcccc:;;;;;,,,,,,,,,,'''''''''''''''''''''''...  .        .........................\r\n" + 
		 		"OOkkkkkxddkKK0kkkdodxkkkxxxddddooooc;,',''.''',,;cONNXKKXXKKKK00OOkdlccc:;;;;;;;;;;;,,,,'''''''''''''''',''''''...  .        .........................\r\n" + 
		 		"kkkOkkkxddOKXK0Okdodxkkxxxxdolcclol;,,,,''''''''';dKNXKKKKXXXKK0Okkxdllc:;;;;;;;;;;;,,,,'''''''''''''''',''''''... .. .  .   .........................\r\n" + 
		 		"kkkkkkkxxdOXNX0Okdodxkxddolcccclooc:::;,'',,''..',cOXXXXXKXXKOOOOOkxdlcc:;,;;;;;;,,,,,'''''''''''''''''''''''''...... .  .............................\r\n" + 
		 		"xxxkkkkxxxOXNK0OOkxxxdolllllloooolcc::,,',,,,,''',,l0XXNNXXX00OOkkxodllcc;;;;;;;,,,,,,,''''''',,,,,,,,''''''''........................................\r\n" + 
		 		"xxxkkkkxxxOXNK0OOOkkkkxxxddollllcclc:;,,,,,''''''',cxKXXNXKKK0Okkkoloolc:::;;;;;;;,,,,,,''''.',,'',,''''''''''... .       ............................\r\n" + 
		 		"dxxxxxxxddOXNX0OOxddxxxdddolc::;;:c:;,,,,,''...''',:l0XXNXKKK0kkkxccollc:::::;;;;;;,,,,,,,,'.'''',,,,,'''''.'...              ........................\r\n" + 
		 		";clodxxxddOXNX00Oxodxkkkkxocc:::loc::;;;,'''''',,,,;:xXNNXKK0OO0Od:cdlc::::::;;;;;;,,,,,,,,'.'''',',,,''''''...          .     .......................\r\n" + 
		 		"..';clddddOXNXK00kooxkkkOdoddolodollc:::,,,,,'',,,',;dXNNXKKOkxkkd:lxdl::;;;;;;;;;;,,,,,,,,..'''''''''''''''....   ......   .   ......................\r\n" + 
		 		".....';clokXNXK00Okdxxkkkddkxdddolll::::;,,,,,,,,,,;:dXNNXK0OOOkxo;lkkdlc:;;;;;;;;;;;;,,,,,..'''''''''''''...... .........      ......................\r\n" + 
		 		"........,;lOXX000kkO00O0Okkkxxdollcc:::;,,;;,,;,;;;ccxXWNXKK00Okko;cxxxdlc:;;;;;;;;;;;;;,,,..',''''''''''................. ..    .....................\r\n" + 
		 		"..........':x00O0Oxk0KK00Okkkkxdlc::::;;;:::;;,,;;clldXWNXXX0kdl:,';:codolcc:::::;;::;;;,,,..',,'''''''''.....................    ....................\r\n" + 
		 		"............,coxkkxdx0KK0OOOkdolccccc::lolcc::;;;;cllxXWNNNXkdoc:c,...';;:cllcc:::;:;;;,,'...........''''............  ......... .....................\r\n" + 
		 		"..............';codxxk0KK0kxollloooc:coxxoccc::::::ld0NWWWXKOOOx:,'.......';:odl:;,,'..............'''''..............................................\r\n" + 
		 		".................,coxxkO00OOkdddolccldkkxdooollcc::co0NWWWX0OOkxl;.........',oOkl,'................','''..............................................\r\n" + 
		 		"...................,coxxkKX0kdlcclodddxxkkkkkxdlcccc:dXNNWX0OOxdo:,..';:clooxOOxc,'...............'',,'...............................................\r\n" + 
		 		"....................';codkkkxxxdxxxxxxxxxxxdollcc::::dXWNNK000Oxo:..;oxO000000ko:,'''............'',,''...............................................\r\n" + 
		 		"......................';:ldkOOkxxxxxxxxxxdollcc:::::;oKNNNXKXK0xl''codxdx0XXK0xc;,,,''''''....'''',,''................................................\r\n" + 
		 		"........................';cdxxxxddddxxddddollcccccc::l0NNNXKKKOo,':lllc::cdxdl:,'''''.''','...',,,,'''................................................\r\n" + 
		 		"..........................';cloddollldddoolllllolllc::dXNXKK0Ox;.,c::::cc:;:;..........',,'...',,,,'''................................................\r\n" + 
		 		"............................',:ccccclddddoodddollccc::ckXXK0Okl'.;:::looolcc:'........',,,,'...,,,'''.................................................\r\n" + 
		 		"...............................';:clooodddoollcccccc::;lOKK00Ol'.,:cdO00Oxoll:'....'''',,,,'...','''.....................................''...........\r\n" + 
		 		".................................,:loodddollllllc:::::;;o0K00Od,.':d0K0Okoc:::;;,,,,,,,''''....','''......................................'','..',,'''\r\n" + 
		 		"..................................',:ldxdddolcc:::::::;;,l000Oxc'.,:::cc:,',''''''............',''.........................................'''..'',,,'\r\n" + 
		 		"....................................';codxdl:::ccc:::;;;,,lk0Oxl;...':dd:',:;'...............''''......................'..........................'',,\r\n" + 
		 		"......................................';:ccccccc::::::;,,'':xOko;,'..cdoc;;cl:.''...'.....',,,''.................'''''''..........................''',\r\n" + 
		 		"........................................,;ccc:::::cc::;,,''.;x0xc:c,.'clcc;;c:',,'.','...',,,'...................'''''''..............................\r\n" + 
		 		".........................................,;::::::c::::;;,''''cO0dcdl..':,,'.,;.''..',....',''..............''''''''...................................\r\n" + 
		 		".........................................,;::::::::::::;,,,'''lOklxk;...................'','..............'''''''''...................................\r\n" + 
		 		"........................................';:cclllllllcc::;;,,'''lkdx0o'..'..............''''..........''''''''...'''............................'''....\r\n" + 
		 		".......................................';:loodddoolcc::;;,,,''''cxxOOl..'',,''''......''''.........'''''''''....'''...................................\r\n" + 
		 		"......................................';:lodddddolcc:;;,,,,,,''.'cxkkkl'............',,'...........'',,,'''''''''.....................................\r\n" + 
		 		".....................................',;coodddollc:;;;;;;;,,''...'lxxxkdc,'......'',,,'...........''',,,,'.'''''......................................\r\n" + 
		 		"....................................'';:looooolcc:;;;;;;,,,,''..''':odxxdocc:::;;;;;,'.......''''''',,,;,'',;,'.......................................\r\n" + 
		 		"....................................',:cloddolcc::;;;;;,,,,''.',,'..,cloolcccc::;;,,......''',,,,,,,,,,;;,,,;;'.......................................\r\n" + 
		 		"...................................',;coxkkxoc::;;;;;,,,,,''',;;,..''.',,,,;;;,,''........',,,,,,,,,,,;;;;;;:,........................................\r\n" + 
		 		"..................................'',:oxkOOdlc:;;;;,,,,,,''',;;,'.','.',..',,'.....''''...',,,;;,;;,;,,;;;::;'...',,'........................... .....\r\n" + 
		 		".................................'',;cdxkkkxocc::;,,,;;,''',;;,'.,,,'.',..,,,,'.'''',,,....';,;;;;;,,,,;;;;;;'..'',,'........................    .....\r\n" + 
		 		"\r\n" + 
		 		"");
		 System.out.println("You Died");
	}
	public void option9(Scanner input) {
		 System.out.println("Good Choice. There Is A Break In The Tree Line");
		 
		 while (true) {
			 System.out.println("Examine tree line or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option10(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option11(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option10(Scanner input) {
		 System.out.println("A Deathly Light Begins To Shine Through The Tree Line");
		
		 while (true) {
			 System.out.println("Examine tree line or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 Win(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option11(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void Win(Scanner input) {
		 System.out.println("You Step Forward Into The Light With Pure Fear In Your Heart The Light Slowly Fades Away");
		 System.out.println("WKdccccdk0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXxc:c::ccloONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXOxdOOxxOOdlllllllcccccllollONWWWWWWWWWWW\r\n" + 
		 		"NOlcccclodONWWWWWWWWWWWWWWNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXOdllllllclld0KXXXXXXXXXXXXXXXXXKKXKKKKKKKKKK0OxxkkxxkxllooccccclcccllllokNWWWWWWWWWWW\r\n" + 
		 		"0d:::cccloxXWWWWWWWWWWWWWWKxdxxkxxxxddxxxxxxxdddddxdddddddddodddolccllccccc:ccoooooddddddddddxxdddxxxddxxxxxdxxxddddddollolcccllc:cccllloxXWWWWWWWWWWW\r\n" + 
		 		"xo::cloooodKWWWWWWWWWWWWWWKdoooolllcccloollollllllllllllllllllllllllcccc::cccccccllllllllllloollloooooooddooddxkxxxdddolllcccllc:::cccllldKWWWWWWNNNNN\r\n" + 
		 		"oolloolccclxXWWWWWWWWWWWWW0dolccclccccccccclcllcccllllcccccccllclloollooooooolclcclccclccccccclllllllcllllllodxddddxddolllcccccc::::ccllld0NNXXXNNNNNW\r\n" + 
		 		"clolc::cccco0WWWWWWWWWWWWN0dlcc:cccccc::clccclllcllllclcccccccccclooollllolllccccccccccccccccccccccllclllcclloooododdlcclc::::::;:::ccclclkKK0KNWWWWWW\r\n" + 
		 		"cc:;;;;::cclxKWWWWWWWWWWWXkolcc::cccc:::ccc:cccccccclc:c::cccc:cllloolllllllccccccccccccccccccc:cccclcclcccccllloooooc:ccc::cc:::::::::ccldOKKXWWWWWWW\r\n" + 
		 		"cc:;,;;;::::cONWWWWWWWWWWKdccccccccccccccc:cccccccccccccccclccccllllollllclllccccccc::cccccccccccccccc:cccllccclllllolccc:::ccc::::::::ccldOXX0KNWWWNN\r\n" + 
		 		"odl:;:;;::::cOWWWWWWWWWWWOocccccc:::::cccccclllcccclccccccclllllllllolllllllllcccccccccllccllccccccclcc:ccclccccccclol:c:::;:cc::;::::::cldk00O0XXNNXX\r\n" + 
		 		"lc:::::;;:::l0WWWWWWWWWWNklc:ccc::::::cccccclllccclcc:cclllllllllccllllllllllccccccccclcccclllcccccccccccllllccccccllc::::;:::;;:::::::codddxkkO000KKK\r\n" + 
		 		"ccclc:;,,;;:cOWWWWWWWWWWXdc::::ccccc::cc:cccccllllcc::ccllllllllc:cclcccllllcccccccllllccccccccccccc::::cllolccclllll::::::::cccc::loolodddddddxkOOOOK\r\n" + 
		 		":clll:;,;,;;:dXWWWWWWWWW0oc:::::c:::ccccccccccccllcc:cccccclccllc::cccccclcccclllccccclcccc:cccccc::::::::clllcccllclc:::::;:cllooldddddddddoloddxkkkk\r\n" + 
		 		";:coooc:;;;;;l0WWWMMWWMWOlc::cllllc:ccccccc:cclcllcccllcclllllcllclllcccllccccclllccccllccclcccccc:cclllcclllc::cccclllc:::;::::coddolllodxdoolloddxxx\r\n" + 
		 		";:cclooc::;,,:oxk0NWWWMNxcc::cccccc::ccllcc:cclllllcclccllllllllllcllccccccc:ccllccclllllllc:cccclcccclloolccccccllolll:;::::::cllllllodxxxkxxkxdddxOk\r\n" + 
		 		"::;;cllclooc;;:::lxOXWMXdc:::;;::::;;:::cc:;;:cccc:::::cccccccccc:::::::::;;;::c::::ccccccc:;:::::::;;;:cc:;;;::::clcccccloddc::::ldxxxddoodkkOOkdodkO\r\n" + 
		 		",;:cccclloddolccokXNWWMNOdddo;,''''''''''''''''''''''''',,,,,,,,,,,,'',',,,''''','',,,,,,,'''''''''''''''''''.'..,:llcc::cloxdoc;;:looolc:clodxxxddooo\r\n" + 
		 		";clooollloooolloONWWMMMMMWWWXo;;,;,,,,,,;;;;:::c:::;;:::::::::cc::cccccccccccc:ccc;;,;;;;,;:::ccccc::::;,,,,,,,,,;:codol::;codxocc:cooc:;;;:ccclooolcc\r\n" + 
		 		",;;:clc:;::;;cloxOKWMMMMMMMMNkc:;;;;;;;;coollllllcllldkOOOkkxxxdc;,;,,;;;;;;,,,:xdc:::::::cdxlllllllcodl::::::;;;;:clllolcclooooodooolc:;,,;::cooolc:c\r\n" + 
		 		";,,;:cc:;::,,;:clkXWMMMMMMMMNOoc::::::::lxd:,,,,,,;coxxdxOkOkxddc,',,,,,,,,,'',ckklccllllclkk:'',,'';dxl:ccccc::;:cccccc:coolcllccllc:c:;,,;,;lxxxoccl\r\n" + 
		 		"c:::;;::;::;,,;cdk0NWMMMMMMMNOocccccccc:lkkc'',,,,:loddoxxxkkdddl;o00d:;,;;,,,oO0OolllollloOOc,,,,'':kklcccc::;;;::clc:::cooccllcccc:cccc::;,,;cloddll\r\n" + 
		 		"c::;;,;::::;;;;ckXKKXWMMMMMMW0occccccccclkkc,,;;,,:llodlododdoodc;xWNkl:lkd:;,xKkolllllllldO0l,,;;,,ckklcccc::;;:clclc::ldxxddoolc:cllc::;;c:;;;;;:clo\r\n" + 
		 		":;::;,;;;:c:;;:cOWWNXNMMMMMMWOoccccccccclxkc,,;;,,:lloolloxxddodc;xXk;'':kx:;,d0dllloddooloOOc,,;;,,cOkocccccc::coddxdollooddollc::lol:clccllc:;;,;:cl\r\n" + 
		 		",,;:;;;;::::;;;:kNMWWWWWWWWMNOoccccccccclkkl,,;;,,:lllolcldxdoooc;xWXkloOXk:;,lkkdlllllllllkkc,,;;,,cOOoccccccccclooxkkxxddol::coodddllooolc:;;;;;:cll\r\n" + 
		 		";;;:;;;;::::::::dXNNNNNNXKXNXklccccccloodOkc,,;;,,:lcloooloOkdooc;lkkxdxxxl:,';lxdlcllolccldxc;;;;,,lOOocccccccllodolooolooolllllcclccclllc:;,;;;;;;:l\r\n" + 
		 		"cc:;;;:::c:;::c:lk00KKK0OkOKKxlcccccllldxkkl,,,,,,:lcloddookkoloc,,,;;,,,,,,,,,:lcccclllcccclc,,;;;,ckklcccccc:clolc::cllllllllc:::;;;;:::;;;;;;:;;;;c\r\n" + 
		 		"lc;;;;:::cc:;;::cxOkkOOkkkkOOxccccccccoodddl,,,,,,:cclooodolooooc;;::;,,,,;;;;,::;:c::cc:cccoc:::::,ckxoccccc::lkOdcccllllooc:;;;;,;;,;:c:;;;;;::;;:::\r\n" + 
		 		"::::;;;::::c:;::coxdodxdoodxxl:ccclllloooodc,;;:;,:c:clloxxlclooc,,,,',,,,,,''';c::ccclcc::coc:;;c:,cdoolccccc;:lollllllolll:::;;:::::clc:::;;:::;;:::\r\n" + 
		 		",;:::;;;;;;;:::clolllloolllooc:cclloolclclol;;:::;;:;clllkOoclloc,,;;;,'''''''';c::c:::ccc::cc:;,,;;:ooooc:cllc;,;cc:::clllc:::;codolc:cc::::;;::;;;::\r\n" + 
		 		"',,;;;;:::;;:::colccccllcc:cllccclcclcccccolc::::;;;;clclkkolcclc;;,;cc:;:;,'',:cccccccc:c::ccc::;:cclcclc:loddc::ccc;;:clc:;;;;cool:;;::::::::::ccc:;\r\n" + 
		 		",,;,;;;::c::c::clolclllllllclllclcclcclodxdllol::;;,,:ccokkolccc:;,',;;;::cc:;,:clcccclccc:clodooololllllc:cllolclllc:::c:;,,,;;,,;;,',;;;:::;;:lodo:,\r\n" + 
		 		",;;::::cc:;:c:::clcloododxkxkkxxxolodoodkkooool:;;,',:c:lkxllccc;,,';ccclc::;,';clcccclcc::cccllodddooddkkxdddkkkxdoclllcccc::;,,',,,:cccloddolodool:;\r\n" + 
		 		":coooooolclccccooololoxxkkkkO0O00kdddollodxdllc:;;,,,:cclxdcccc::,,,:oxdc,,,,,';ccclloolclllllooxOkkkkkkkkkOOxxOK0Okdddxxkxxkkxl:;::;colloddooodol:;:c\r\n" + 
		 		"cloooooollllooooollcldxOOOkkxxxk0K0kddddooolccc:;;;;:lolcoxoc::::::::clddc::::::::llloodddxddxkkkO00Okkxxdlol::coxk0000kkkkkOOOOkxkkdoddollxkxdddocccl\r\n" + 
		 		"lclllllllllllolllcldkOOOOOO0OOOO0000Okxddoollllc:::loooc:lol:;;;::::::codl::::::clooodddddddxxkkO00OkxddoooodolloddkkOOkxk0K00KKKKKKK0000OkOKOxdodooox\r\n" + 
		 		":cccc:::ccccclolllokOkxdolloxxddxkOkxodxddoodddddxxxxdddddolcc::::::;;lxdc:::loodxxddxxxxdllloxkkkdlcldl:cllllloddolloxkkO00OOOOO0KK00000KOkOOOkdooodx\r\n" + 
		 		":odl:;;c::::ccllodxxxxdc:c:;lc::ldxo::oxkxddxxddxxxxxxxxxxxxxdoollllc:clooooodoooodddxxxxddxdoooolc:::ccclc;;::cc:cldxkO00OkdloddxkkxxkxxxddxkOOkkkkkk\r\n" + 
		 		"looc:::::::::::coddolldoooc:::,,;;::;:coxddxxoodddodoolooooodxxdddol:ccclodddooodxkkkkkkkxkkkxdolllc:::,,:::::cccccldxkxxkOkdoddlldxdxkxxdoodxxxdxkOkx\r\n" + 
		 		"odoc:c::ll:;;:;:ccllcldkxdc;;;,,,,,;::ldxddddlodddollccllloddddoddolcloooooddxxxxkxdlloooodddoloolllcc:;;;;:coooxkdlooc;codxkkkkxdloddo:clodxxxxooxOkx\r\n" + 
		 		"");
		 System.out.println("You Won");
	
	}
	public void option11(Scanner input) {
		 System.out.println("Interesting Choice. There's A Low Chrunching Sound Gowing Off In The Distance");
		
		 while (true) {
			 System.out.println("Examine or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option12(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option12(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option12(Scanner input) {
		 System.out.println("As You Get Closer You See That There Is A Long Limbed Creature Eating What Seems To Be A Human Body");
		
		 while (true) {
			 System.out.println("Examine or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option13(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option13(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void option13(Scanner input) {
		 System.out.println("This Creature Is So Long It Is The Height Of An Average Male Human But As Long As A White African Elephant");
		
		 while (true) {
			 System.out.println("Examine Man or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 XenoMorphDeath(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 XenoMorphDeath(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}
	public void XenoMorphDeath(Scanner input) {
		 System.out.println("The Thing Sits In Silence All The Birds Have Stopped Making Noise. It Lifts It's Head You See Know Eyes It's Head Opens Up Almost As If It Were Listening For Something ");
		 System.out.println("You Take A Step Towards It. It Snaps It's Head And Lunges Straight At You!");
		 System.out.println(";;;;;;;;;::::::::cccllllllllooooooddddddddddddddxxxxxxkkkkkkkOOOOOx:,.      .''...,..   ..                  ..,cc:;.   ....'okdccccdOKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNNNNWWWWNNNNNNNNNNNNNNNXXXXXX\r\n" + 
		 		";;;;;;;;::::::::ccccllllllllooooooddddddddddxxdxxxkkxkkkkkkkOOOOOOo,.      ..'. ....... ...                ....',,.... ......;,.   ..,ckkxkXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNWWNNNNNNNNNNNNNNNNXXXXXXX\r\n" + 
		 		";;;;;;::::::cccccccclllllllooooooddddddddxxxxxxxxkkkkkkkkkkkkOOOOx;..     ..'..   ....  ..  .              ..  .......   .. .:k0l.  ..';:;':0WMMMMMMMMMMMMMMMMMMMMMMMMMWWWWNNNNNNNXXXXNNNNNNNNNNNXXXXXXX\r\n" + 
		 		";;::::::::ccccccccccclllllooooooddddddxxxxxxxxxxxkkkkkkkkkkkkOOOx:'...   ....       ......                        ...     .   :OXk,   ...',';dKWMMMMMMMMMMMMMMMMMMMMMMWWWWNNNNNXXXXXXXXXXNNNNNXXXXXXXXXX\r\n" + 
		 		";;::::::::cccccccccccllllooooooddddddxxxxxxxxxxxxkkkkkkkkkkkkkOkl,'.......           ...... .....          .                  .lOOl.       ...ckXWMMMMMMMMMMMMMMMMMMWMWWWNNXXXXXXXXKKKKKXXXXXXXXXXXXXXXX\r\n" + 
		 		";;:::::::ccccccccccllllllooooodddddddxxxxxxxxxxxxkkkkkkkkkkkkkOd:'.    .'.              .. ..','.       .....                  .;:,.        .,loxKWMMMMMMMMMMMMMWWWWWWWNNXXXXXXXXXKKKKKKKKXXXXXXXXXXXXXX\r\n" + 
		 		";:::::::ccccccccllllllooooooooddddddxxxxxxxxxxxxkkkkkkkkkkkkkkOl.      ..,'..     ...    .  .,;,.    ..........            ....',::.         ,kOxkKWWWWWWWWWWWWWWWWWNNNXXXXXXXXXXKKKKKKKKKKKKKKXXXXXXXKK\r\n" + 
		 		":::::ccccccccccllllllooooooooddddddxxxxxxxxxxxkkkkkkkkkkkkOOOkkc.          .                 ';.  .   .........            .,:loldo'         :0kdxOKNNNNNNNNNNNNNNNNXXXXXXXXXXXXKKKKKKKK00000000KKKKKKKK\r\n" + 
		 		":::ccccccccccllllllloooooooodddddddxxxxxxxxkkkkkkkOOOOOOOOOkd;'.                             ... ..    .... ..      ... ..  'lkkxOk,         cOdxOOOKXXNXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKK00000000000000KKK\r\n" + 
		 		":cccccccccclllllllllooooooooddddddxxxxxxxxkkkkkkOOOOOOOOOOOo.                               .......    ..'....     .... .... .';ldd,  ..     ,lldkxx0XXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKK000000000OOOO00000\r\n" + 
		 		":cccccccclllllllloooooodddddddddxxxxxxxxxkkkkkOOOOOOOOOOOOx,                                .......      ..       .........   .......          ..;loOXNNNNNNNNNNNNNNXXXXKKKKKKKKKKKKKK000000000000000000\r\n" + 
		 		"cccccllllll;;okdooooooddddddddxxxxxxxxxxkkkkkkOOOOOOOOOOOOl.      ..                       ........    .......    ......',.  .....               .ckKNNNNNNNNNNNNWWWNNNNXXXXXXKK0KKKKKKKKK0000KKKK000000\r\n" + 
		 		"cclllllllc,.;kXkllooooddddddxxxddxxxxxxkkkkkkkkkOOOOOOOOOx,.     ...                       . ...''..    ,lcc:'.. .,'.',,;:;'........       ...   ,kXXNNNNNNXXXNNNWWWNNNNNNNNNXXKKKKXXXXXXKKKKKKKK0000000\r\n" + 
		 		"cccccccc;'..,d0x;,,;;lxxddddddc,;dkxxkxkkkkkkkkkkkOOOOOxo;..                      .   ..     ...'',.    'lc,..  .;:;;;:;'',,.   .'..,.     .cl, .oKKXNNNNNXXXXXXXNNXXXNNNNNNNNXK0KKXXXXXXKKKKKKK00000000\r\n" + 
		 		",,'''''......;ll:,,,',ldddolc,...:dxkkkkkkkkkkkkkkkkxoc;'..        .           ...,,',,.    .....',..    .. ..'clldkxl;'.  ..    .,,;,     .ckdcd000KKXXXXXXXXKKKKKXXXXXXXXXNNXK00KKXXXXKKKKKKKKK0000000\r\n" + 
		 		"......   ......,,,;,'..;:;,...  ..:k0kxxkkkkkkkkkkdc,......  .     ..     .......',::,.     .......        .,cxOOdc:c:,.   .','..,;::;'.....oOkkO0000KKKKKKKKKKKKKKKKKKKKKKKXXKK00KKKKKKKKKKKKKKK0000000\r\n" + 
		 		"....    ..........''','','..     .':xOkkkkxxxxxdo:.   ....  ..      .........,',;;:,.       .             .';:;lxc,,,:c,.  .,;::;;;:;'.....;ldkkOOO000KKKKKKKKKKKKKKKKKKXXXXXXXXKKKKXXXXKKKKKKKK00000000\r\n" + 
		 		"          ............'..'..     ...'clokxoc;;,'..    ....  ..       ..........';'.            ..      ..';'..'cdl;:;:lc'  .    ......','..:dxxkOOOO0000KKKKKKKKKKXXXNNWWWWWWWWNXK0KXNNNNXXXKKK000000KXK\r\n" + 
		 		"           ...............,..   ........;o:.         ....  ...         .'.....',.            ..... ......,;.  .ckd;;;,;cc' .           .',,;ldxkOOkOO00000KKKKKXNNWWWNNNXXXKKKKK00O00KKKKKKXKKKKK00KXNNK\r\n" + 
		 		"       ........    ..  ..','..   ...     ..         .....  ...         .....,;'.          .  ......''''',,.  ..,xx;...,:ol'              ...'cdddxxkOO000000KKXNXXXKK00000OOOOOOOOOOOOkkkkkOOO0000KNWNKx\r\n" + 
		 		"       .......          .....   ...                 ....   .,.    ....';'. .,'..'.     . ...'''..''....','. ..''okl'':llddc.             ....'loccokkO0000000KKK00OOOOOOOOOOOOOOOOOOOOOOkkkkkkkkOKNWN0do\r\n" + 
		 		"       ....             .....               ..     ....    ';.  ...'''....,::c;,:;. ..';'''......     .',. ...'';od:,:oooooc.              ..':llldxkOOO00000000OOOOOOOOOOOOOOOOOOOOOOOOOkxxxxxOKNWXOdol\r\n" + 
		 		"                          ...             ...      ....    .;,.  ..  ....'cl;,',ld;':ool,.         ....,:.      .,c:;;cldkxl,.        ..   ..,,;lodxxkkOOOOOOOOOOOOOkkkkkkkkkkkkkOOOOOOOOkxxxxkKNNKkoooo\r\n" + 
		 		"                          ..              .'.      .,'.   ..';.       ....;,';cdxxocdo:'           .,,...         'lc,:ok0Oxl:'       .cc'..'cc;:oddxxkkOOOOOOOOkkkkkkkkkkkkkkkkkkkkkOOOOkxxxxOKKOdolllo\r\n" + 
		 		"  .                                       .''.    ..;;'. .  .;,.         ..':dkkxc:oxkd'           ...,.          .;:',lxkOOx:,.  ..'codkxc'.':;:ooodxxkkkkkOkkkkkkkkkxxxxxxxxxxxkkkkOOOkkxxxdxxdolllllo\r\n" + 
		 		"                     .    .                ............ ..  ..''..        .,,;:ldlcxxdx,          ..','.          ...',:odkOxc,.  .,okdloxx;..,:lollodxxxkkkkkkkkkxxxxxxxxxxxxxxxkkkkO0Okxxxdoolllllllll\r\n" + 
		 		"                                              ......   ..   ...;'.         ..':c::;:loo'          .';,.            .',,;;:xkoc;',,,'..'':dxo;;clllllooddxxxxxxxxxxxxxxxxxxddddddxxkkxkOOkxdddollcccloooo\r\n" + 
		 		"               ..   .                                  ..   .  ......      ..,l:...,cdo'          ....             ....,,':dxddl;...   .,oxxddollcccloooddxxxxxxxxxddddddddddddddxxxdxxxxdooollccccloooo\r\n" + 
		 		"                                                                ......     .......,:cll;.        .,..              .......;oxkd'      .,;ldddollcc:cclloodddddddddddddddddddddddddddodddooolllcccclllooo\r\n" + 
		 		"                                                                             ......,::::.       ..;'.              ....',;lkkkd'     .;clodxxkxoc:::ccllloodddooooooooooooooooddddooooooollllccccclllool\r\n" + 
		 		"                                                                            ........',,,.     ...;:,..   .................':d0O,    .,cdxdokkOKOdc:::cccllooooooooooooooooooooooooollllllllcccccclllloll\r\n" + 
		 		"                       ..                                                   .. ...............''',,'..  ..''.............,;,:kO:   .,;:odc;cccokkxoc:ccccllllllllloooooooolllllooollccllcccccc:cccclllll\r\n" + 
		 		"                   .            ..                                          .......''..........,;;'...   ...... ...........',cd:  .;;;::lc;;;,:oxkOkdlc:ccccllccllllllllllllllllollccccccc::::::::ccllll\r\n" + 
		 		"          .                                                                   .....''..........,;,....    .... ..........     ....,;'..,:;,:c::oOKNX0Okdlcccccccccllllllllccccllllcccccc::::::::::clloll\r\n" + 
		 		"         ..                                               .   .               ......,,'...''........'............             ...';'.......:lc;,ckOkOOO0Oxoc::::ccccccclccccccllllc::::::::;;;;;::clooll\r\n" + 
		 		"                                                                          .   .. ..,;cc''c;...''.''...... ....,'             ....;;'..    .;c:;;cc::lodk0XKdc::::::cccccccc::cllllc:;::::;;;;;;;::cldool\r\n" + 
		 		"                                                                           .  ... .,:l;.co,',,,...........,c,.'....          ...,:;...    .,:;:odl:coddk0KKOl:;;;;::::cccc:::clool:;;;;;;;;;;;;;;:cooool\r\n" + 
		 		"                                                                               .  .,::',l,.c:..:;',. ':,..cc''.....        .....,,..       ..;okxlllokxddddxxc;;;;;;:::::::::clolc:;;;;;;,,,,,,;;:cooool\r\n" + 
		 		".                                                                           .. ....,;,.';';l,.;:';,..,;..,:...   ...      ..,',cc,.         .'lkdlllclooddokOxl;,;;;;;::::::::ccc:;;,,,,,,,,,,,,;:codool\r\n" + 
		 		"...                                                                         ... .. .:,.'..:c.';..;..''.  . ..   ....      .'::::;'....     ...,oxollclodkkdxxxxc,,,;;;;;;;;;;clllc;,,,,,,,,,,,,,;:codool\r\n" + 
		 		".....                                                                        ......''.,' .;,....,,.......  ...   .        .;'...''...      ..',cooddolloxxdxxdxd:,,,,;;;;;;,;clolc;,,,,,''''''',;clodool\r\n" + 
		 		"........                                                                       ......';'.',...';,.''...'. ..             'c:.  .....       ..',;:cloodollodxxxkkl,,,,,;;;;;,;clllc;,''''''''''',;cloddol\r\n" + 
		 		"....................                                                            ........,,....;;..:,....       ...     ...'..               ..,;..'lxdlc:codxkddl;'',,,;;,,,;cllc:,'''''''''''',;:loddol\r\n" + 
		 		".......................                                                           .... .'....';'..'.....     .............  ....             ..'....',';cllclddddc,',,,,,,,,,:ccc;,'''''''''''',;:coddol\r\n" + 
		 		"........................      .                                                     ...  .''..........    ...',,'''''.'...                     ....''...,;:cdolool:'',,,,,,',:cc:;,''''''..''''';:coddol\r\n" + 
		 		".......................       .   ..  ..                                              ..  .......      ...''''',,;;;,'''.                         .''......';:::loc,'',,,,,',:c:;,''''''.....''',:coddol\r\n" + 
		 		"........................               .                                   ....           ....     ..............',,,...                            ........';;lxd:''',,,,'',;::;,''...........',;coddoc\r\n" + 
		 		".........................                                                 ...,'          ..      ..''............... ..                            ...,:c::::cccldl;.'''''''',,,'''............',;coddoc\r\n" + 
		 		"..........................                                                  .,.       ...    ..............          ',.                       .................,okl'...''''''''...............'';coddlc\r\n" + 
		 		"....................... ...                                                 ...        ..........                    .'                 .                .......';lo,..........................'';coddlc\r\n" + 
		 		"....................    ....                                                 ..       .... .....                                        ..          ..      ..',,;cl;..........................'';coddoc\r\n" + 
		 		"");
		 System.out.println("You Died");
	}
	/*
	public void option2(Scanner input) {
		 System.out.println("Welcome to Cormanthor");
		 System.out.println("It is Friday the 13th and there is a tree with knife marks and large amounts of blood");
		 
		 while (true) {
			 System.out.println("Examine tree or Move on");
			 String choice = input.nextLine();
			 if (choice.contentEquals("Examine")) {
				 option1(input);
				 break;
			 }
			 else if (choice.contentEquals("Move on")){
				 option2(input);
				 break;
			 }
			 else {
				 System.out.println("thats not an option:");
			 }
			 
		 }
		 
		
	}*/
	
	public My_Adventure() {
		Scanner input = new Scanner(System.in);
		start(input);
	}

	public static void main(String[] args) {
		new My_Adventure();


	}

}

