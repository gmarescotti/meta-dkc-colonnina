
SUMMARY = "Python Geocoding Toolbox"
HOMEPAGE = "https://github.com/geopy/geopy"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b246754361f75980923b7feebfe71c15"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/e8/8c/dcf0be82be971069c99ad845eadbfcc9915173992dcee1111e142bceea46/geopy-2.1.0.tar.gz"
SRC_URI[md5sum] = "a6dc8a28bbb9f4990fc24a7ced066e1d"
SRC_URI[sha256sum] = "892b219413e7955587b029949af3a1949c6fbac9d5ad17b79d850718f6a9550f"

S = "${WORKDIR}/geopy-2.1.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-geographiclib"

BBCLASSEXTEND = "native nativesdk"
