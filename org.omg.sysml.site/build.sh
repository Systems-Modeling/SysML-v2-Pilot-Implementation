#!/bin/sh

# build script for automating markdown to pdf generation

pandoc README.md \
    -V geometry:margin=0.5in \
    --variable urlcolor=blue \
    -o README.pdf
