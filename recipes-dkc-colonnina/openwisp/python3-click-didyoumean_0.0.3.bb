
SUMMARY = "Enable git-like did-you-mean feature in click."
HOMEPAGE = "https://github.com/timofurrer/click-didyoumean"
AUTHOR = "Timo Furrer <tuxtimo@gmail.com>"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://setup.py;md5=ebf203756255d2e95d1f72919513a266"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/9f/79/d265d783dd022541b744d002745d9e55d84c04a41930e35d8795934f6526/click-didyoumean-0.0.3.tar.gz"
SRC_URI[md5sum] = "08ac34aa0355f58ffc43ee57f1969ffb"
SRC_URI[sha256sum] = "112229485c9704ff51362fe34b2d4f0b12fc71cc20f6d2b3afabed4b8bfa6aeb"

S = "${WORKDIR}/click-didyoumean-0.0.3"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
