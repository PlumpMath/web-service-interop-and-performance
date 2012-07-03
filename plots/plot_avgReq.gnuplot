set ylabel "Average response time in ms"
set xlabel "Requests per second"
set key right top
plot "avgReq-Axis2.txt"\
      title "Axis2" with lines linecolor rgb "#008000",\
      "avgReq-CXF.txt"\
      title "CXF" with lines linecolor rgb "#FF0000",\
      "avgReq-gSOAP.txt"\
      title "gSOAP" with lines linecolor rgb "#0000FF",\
      "avgReq-Metro.txt"\
      title "Metro" with lines linecolor rgb "#00FFFF",\
      "avgReq-PHP.txt"\
      title "PHP" with lines linecolor rgb "#000000",\
      "avgReq-WCF.txt"\
      title "WCF" with lines linecolor rgb "brown"
