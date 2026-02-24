export function longestCommonPrefix(strs: string[]): string {
  if (strs.length === 0) return "";
  const sorted = [...strs].sort();
  const first = sorted[0];
  const last = sorted[sorted.length - 1];
  const limit = Math.min(first.length, last.length);
  for (let i = 0; i < limit; i++) {
    if (first[i] !== last[i]) {
      return first.slice(0, i);
    }
  }
  return first.slice(0, limit);
}

console.log(longestCommonPrefix(["flower", "flow", "floweight"])); 