function nhan(a, b) {
    if (!Number.isInteger(a) || !Number.isInteger(b)) {
        throw new TypeError("A & B must be an Integer");
    }

    let result = 0;
    const overlap = Math.abs(b);

    for (let i = 0; i < overlap; i++) {
        result += a;
    }


    return b < 0 ? -result : result;
}

console.log(nhan(2, 3));
console.log(nhan(-2, 3));
console.log(nhan(-2, -3));
console.log(nhan(2, -3));