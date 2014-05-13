# Project Euler. Problema 20.
#
# Calcular la suma de los dígitos del factorial de 100

puts (1..100).inject(:*).to_s.split("").map{|n| n.to_i}.inject(:+)
