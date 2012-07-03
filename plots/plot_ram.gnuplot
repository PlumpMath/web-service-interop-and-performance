set ylabel "RAM usage in Megabyte"
set xlabel "Requests per second"
set key right bottom
plot "ram-Axis2.txt"\
      title "Axis2" with lines linecolor rgb "#008000",\
      "ram-CXF.txt"\
      title "CXF" with lines linecolor rgb "#FF0000",\
      "ram-gSOAP.txt"\
      title "gSOAP" with lines linecolor rgb "#0000FF",\
      "ram-Metro.txt"\
      title "Metro" with lines linecolor rgb "#00FFFF",\
      "ram-PHP.txt"\
      title "PHP" with lines linecolor rgb "#000000",\
      "ram-WCF.txt"\
      title "WCF" with lines linecolor rgb "brown"

