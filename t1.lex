%%
%standalone
%%

^[0-9]{2}\.[0-9]{3}\.[0-9]{3}\/0001-[0-9]{2}$ { System.out.println("CNPJ"); }
^[A-z0-9]+\.{0,3}@[A-z]+.com$ { System.out.println("Email"); }
^http[s]?:[\/\]]{2}[A-z0-9]+[\.\]]com$ { System.out.println("URL"); }
^[0-9]{4}[-][0-9]{4}[-][0-9]{4}[-][0-9]{4}$ { System.out.println("Cartão de Crédito"); }
^[0-9]{4}[-][0-9]{4}$ { System.out.println("Telefone fixo"); }
^[A-Z]{3}[[:blank:]][0-9]{1}[A-Z][0-9]{2}$ { System.out.println("Placa Mercosul"); }
^[0-9]{13}$ { System.out.println("ISBN"); }
^[0-9]{1,3}[\.\]][0-9]{1,3}[\.\]][0-9]{1,3}[\.\]][0-9]{1,3}$ { System.out.println("IP"); }
-?\b\d+(\.\d*)?([eE][+-]?\d+)?\b { System.out.println("Números Reais"); }