#############################################################################
# Project Euler. Problema 21
#
# Suma de los números amigos menores de 10.000
#
# amigo1 -> suma factores = amigo2
# amigo2 -> suma factores = amigo1
#
############################################################################
def sumDivs(n)
  suma = 0
  d = n - 1
  d.downto(1) {|i|
    if(n%i == 0) then
      suma += i
    end
  }
  suma
end

arr = []
for n in (1...10000)
  if !arr.include?(n) and n == sumDivs(sumDivs(n)) and sumDivs(n) != n
    arr.push(n).push(sumDivs(n))
    puts "Found!: #{n} <=> #{sumDivs(n)}"
  end
end

puts arr.inject(:+)
