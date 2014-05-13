# Project Euler. Problema 19.
#
# ¿Cuantos primeros de cada mes caen en domingo en el S. XX? (1-1-1901 a 31-12-2000)

sundays=0
1901.upto(2000){|y| 1.upto(12){|m| sundays=sundays.succ if Time.new(y,m,1).sunday? }}
puts sundays
