
SUMMARY = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "http://cffi.readthedocs.org"
AUTHOR = "Armin Rigo, Maciej Fijalkowski <python-cffi@googlegroups.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

SRC_URI = "https://files.pythonhosted.org/packages/a8/20/025f59f929bbcaa579704f443a438135918484fffaacfaddba776b374563/cffi-1.14.5.tar.gz"
SRC_URI[md5sum] = "272cb183bf0365530e3c0d8f446cd89d"
SRC_URI[sha256sum] = "fd78e5fee591709f32ef6edb9a015b4aa1a5022598e36227500c8f4e02328d9c"

S = "${WORKDIR}/cffi-1.14.5"

RDEPENDS_${PN} = "python3-pycparser"

inherit setuptools3
