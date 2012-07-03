set ylabel "CPU usage in percent"
set xlabel "Requests per second"
set key right bottom
plot "cpu-Axis2.txt"\
      title "Axis2" with lines linecolor rgb "#008000",\
      "cpu-CXF.txt"\
      title "CXF" with lines linecolor rgb "#FF0000",\
      "cpu-gSOAP.txt"\
      title "gSOAP" with lines linecolor rgb "#0000FF",\
      "cpu-Metro.txt"\
      title "Metro" with lines linecolor rgb "#00FFFF",\
      "cpu-PHP.txt"\
      title "PHP" with lines linecolor rgb "#000000",\
      "cpu-WCF.txt"\
      title "WCF" with line linecolor rgb "brown"

