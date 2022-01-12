
SUMMARY = "CFFI-based Python binding for LZF stream compression"
HOMEPAGE = "https://github.com/lordmauve/lzf"
AUTHOR = "Daniel Pope <mauve@mauveweb.co.uk>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=d77f597ec060b4371019ec86c2d02c48"

inherit pypi setuptools3

SRC_URI[md5sum] = "b9094aa8ea99ab95644dc82525ffb5e8"
SRC_URI[sha256sum] = "2163a5172f7328baa4a5a0a351617a4d92a5d264975e67f581ed24a9dcf8893b"

PYPI_PACKAGE = "lzf"

DEPENDS += " ${PYTHON_PN}-cffi-native"
RDEPENDS_${PN} = "python3-cffi"

# BBCLASSEXTEND = "native nativesdk"

