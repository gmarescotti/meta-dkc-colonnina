
SUMMARY = "Mangling of various file formats that conveys binary information (Motorola S-Record, Intel HEX and binary files)."
HOMEPAGE = "https://github.com/eerimoq/bincopy"
AUTHOR = "Erik Moqvist <erik.moqvist@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9aa4ec07de78abae21c490c9ffe61bd"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/7f/df/37fc7e88b91f9a83b9d3ade9459c5ad2a908c70390043a62c0b08a538af6/bincopy-17.10.1.tar.gz"
SRC_URI[md5sum] = "17343c5670486fb1e28eaf8fa1bddddb"
SRC_URI[sha256sum] = "373c92d1a61e78ee033ec2f7e0d3bc07b173a04673bc8e5d5e1d8efc53b30832"

S = "${WORKDIR}/bincopy-17.10.1"

DEPENDS += " "
RDEPENDS_${PN} = "python3-humanfriendly python3-argparse-addons python3-pyelftools"

BBCLASSEXTEND = "native nativesdk"
