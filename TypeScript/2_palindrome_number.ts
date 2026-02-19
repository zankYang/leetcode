export function palindromeNumbre(x: number): boolean {
  const arrayNumber = x.toString().split("");
  for (let index = 0; index < arrayNumber.length/2; index++) {
    if (arrayNumber[index] != arrayNumber[arrayNumber.length-1-index]) {
      return false;
    }
    
  }
  return true;
  }

  console.log(palindromeNumbre(121)); 
  console.log(palindromeNumbre(-121));